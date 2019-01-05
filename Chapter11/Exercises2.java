package Chapter11;

/**
 *
 * @author Havis
 */
class Person{
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {
    }
    
    public Person(String name){
        this.name = name;
    }
    
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "\nName : "+getName()+
                "\nAddress : "+getAddress()+
                "\nPhone Number : "+getPhoneNumber()+
                "\nEmail : "+getEmail();
    }
    
}

class Student extends Person{
    private final String status;

    public Student() {
        this.status = null;
    }

    public Student(String status, String name) {
        super(name);
        if (status != "Freshman" && status != "Shopomore" && status != "Junior" && status != "Senior" ) {
            status = "";
        }
        this.status = status;
    }

    public Student(String status, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        if (status != "Freshman" && status != "Shopomore" && status != "Junior" && status != "Senior" ) {
            status = "";
        }
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nStatus : "+getStatus(); 
    }
    
}

class Employee extends Person{
    private String office;
    private int salary;
    private MyDate dateHired = new MyDate();

    public Employee() {
    }

    public Employee(String office, int salary, String dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired.setDMY(dateHired);
    }

    public Employee(String office, int salary, String dateHired, String name) {
        super(name);
        this.office = office;
        this.salary = salary;
        this.dateHired.setDMY(dateHired);
    }

    public Employee(String office, int salary, String dateHired, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired.setDMY(dateHired);
    }

    public String getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired.toString();
    }

    public void setDateHired(String dateHired) {
        this.dateHired.setDMY(dateHired);
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nOffice : "+getOffice()+
                "\nSalary : "+getSalary()+
                "\nDate Hired : "+getDateHired();
    }
    
}

class Faculty extends Employee{
    private int officeHours;
    private String rank;

    public Faculty() {
    }

    public Faculty(int officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(int officeHours, String rank, String office, int salary, String dateHired, String name) {
        super(office, salary, dateHired, name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(int officeHours, String rank, String office, int salary, String dateHired) {
        super(office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    public Faculty(int officeHours, String rank, String office, int salary, String dateHired, String name, String address, String phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nOffice Hours : "+getOfficeHours()+" Hours"+
                "\nRank : "+getRank();
    }
    
}

class Staff extends Employee{
    private String title;

    public Staff() {
    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String title, String office, int salary, String dateHired) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public Staff(String title, String office, int salary, String dateHired, String name) {
        super(office, salary, dateHired, name);
        this.title = title;
    }

    public Staff(String title, String office, int salary, String dateHired, String name, String address, String phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTitle : "+getTitle();
    }
    
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate() {
        year = 1970;
        month = 1;
        day = 1;
    }
    
    public MyDate(String dmy){
        String[] splitDMY = dmy.split("/");
        int year = Integer.parseInt(splitDMY[0]);
        this.year = year;
        int month = Integer.parseInt(splitDMY[1]);
        this.month = month;
        int day = Integer.parseInt(splitDMY[2]);
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        if(month>12 || month<0){
            
        }else{
            this.month = month;
        }
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    
    public void setDMY(int day, int month, int year ){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public void setDMY(String dmy){
        String[] splitDMY = dmy.split("/");
        int year = Integer.parseInt(splitDMY[2]);
        this.year = year;
        int month = Integer.parseInt(splitDMY[1]);
        this.month = month;
        int day = Integer.parseInt(splitDMY[0]);
        this.day = day;
    }

    @Override
    public String toString() {
        return getDay()+"/"+getMonth()+"/"+getYear();
    }
    
}
public class Exercises2 {
    public static void main(String[] args) {
        // status (Freshman, Sophomore, Junior, or Senior)
        Student std = new Student("Freshman", "Havis", "Padang Panjang", "082284461234", "hzevika@gmail.com");
        // format dateHired = DD/mm/yyyy on double quote(string)
        Faculty fct = new Faculty(20, "Lecture", "UNP", 6000000, "08/07/2018", "Zevik", "Padang", "082284461234", "viszevik@gmail.com");
        // 
        Staff stf = new Staff("Supervisor", "Traveloka", 6000000, "08/07/2018", "Zevik", "Padang", "082284461234", "viszevik@gmail.com");
        
        System.out.println(std.toString());
        System.out.println(fct.toString());
        System.out.println(stf.toString());
    }
}
