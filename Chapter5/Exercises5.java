package Chapter5;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises5 {
    public static void displaySortedNumber(double num1, double num2, double num3){
        for (int i = 0; i < 3; i++) {
            if(num1 > num2){
                double temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 > num3) {
                double temp = num2;
                num2 = num3;
                num3 = temp;
            }
        }
        System.out.println(num1+" "+num2+" "+num3);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number : ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumber(num1, num2, num3);
        
    }
}
