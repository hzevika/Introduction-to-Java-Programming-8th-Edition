package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight in pounds : ");
        float weighInPounds = input.nextFloat();
        System.out.print("Enter Height in inches : ");
        float heightInInches = input.nextFloat();
        
        float weightInKilograms = (float) (weighInPounds * 0.45359237);
        float heightInMeters = (float) (heightInInches * 0.0254);
        
        float bmi = (float) (weightInKilograms / Math.pow(heightInMeters, 2));
        System.out.println("BMI is : "+bmi);
    }
}
