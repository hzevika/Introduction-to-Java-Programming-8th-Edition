package Chapter10;

/**
 *
 * @author Havis
 */

class BMI{
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    
    public BMI(){
        
    }
    
    public BMI(String name, int age, double weight, double feet, double inches){
        this.name = name;
        this.age = age;
        this.weight =  weight;
        this.feet = feet;
        this.inches = inches;
    }
    
    public double getHeight(){
        return (feet*12)+(inches);
    }
    
    public double getBMI(){
        double bmi;
        bmi = (weight/getHeight()/getHeight())*703;
        return bmi;
    }
    public String getNama(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getCategory(){
        String category = "";
        if (getBMI()<17.0) {
            category = "Kurus, sangat kekurangan berat badan.";
        }else if(getBMI()>17.0 && getBMI()<=18.4){
            category = "Kurus, kekurangan berat badan.";
        }else if(getBMI()>18.4 && getBMI()<=25.0){
            category = "Normal";
        }else if(getBMI()>25.0 && getBMI()<=27.0){
            category = "Gemuk, kelebihan berat badan.";
        }else if(getBMI()>27){
            category = "Gemuk, sangat kelebihan berat badan.";
        }
        return category;
    }
}

public class Exercises2 {
    public static void main(String[] args) {
        BMI bmiHavis = new BMI("Havis",21,152,5,8.5);
        System.out.println(  "Name    : "+bmiHavis.getNama()
                            +"\nAge     : "+bmiHavis.getAge()
                            +"\nBMI     : "+String.format("%.2f",bmiHavis.getBMI())
                            +"\nCategory: "+bmiHavis.getCategory());
    }
}
