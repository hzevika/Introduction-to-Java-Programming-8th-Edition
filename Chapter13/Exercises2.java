package Chapter13;

import java.util.Scanner;

/**
 *
 * @author Havis
 */
public class Exercises2 {
    public static void main(String[] args) {
        int a = 0, b = 0, result;
        boolean valid;
        do {  
            valid = true;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter two integer (ex. 10 2) : ");
            try {
                a = input.nextInt();
                b = input.nextInt();
            } catch (Exception e) {
                System.out.println("There is something wrong with your input.");
                System.out.println("Please try again...");
                valid = false;
            }
            if (valid) {
                result = a + b;
                System.out.println(a+" + "+b+" = "+result);
            } 
        } while (!valid);
    }
}
