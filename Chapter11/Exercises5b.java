package Chapter11;

/**
 *
 * @author Havis
 */
class Courses{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    
    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        String msg = "Course Name : "+getCourseName()+
                "\nCount of students : "+(getNumberOfStudents())+
                "\nStudent : ";
        for (int i = 0; i < numberOfStudents; i++) {
            msg = msg.concat("\n"+(i+1)+". "+students[i]);
        }
        return msg;
        
    }
    
}

public class Exercises5b {
    public static void main(String[] args) {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add(new Courses("Math"));
        ((Courses)list.get(0)).addStudent("Havis");
        ((Courses)list.get(0)).addStudent("Zend");
        ((Courses)list.get(0)).addStudent("Zevik");
        System.out.println(((Courses)list.get(0)).toString());
        System.out.println("");
        list.add(new Courses("English"));
        ((Courses)list.get(1)).addStudent("Zevv");
        ((Courses)list.get(1)).addStudent("Vis");
        System.out.println(((Courses)list.get(1)).toString());
    }
}
