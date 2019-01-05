package Chapter11;
import java.util.ArrayList;
/**
 *
 * @author Havis
 */
class Course{
    ArrayList students = new ArrayList();
    private String courseName;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }
    
    public ArrayList getStudents(){
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
        msg+=students.toString();
        return msg;
        
    }
    
}

public class Exercises5 {
    public static void main(String[] args) {
        Course mt = new Course("Math");
        mt.addStudent("Havis");
        mt.addStudent("Zevik");
        mt.addStudent("Zend");
        System.out.println(mt.toString());
    }
}
