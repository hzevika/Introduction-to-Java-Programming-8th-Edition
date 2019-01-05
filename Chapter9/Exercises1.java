package Chapter9;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your social security number (format : DDD-DD-DDDD) : ");
        String ssn = input.nextLine();
        System.out.print(ssn+" is ");
        char[] s = ssn.toCharArray();
        boolean valid = true;
        for (int i = 0; i < s.length; i++) {
            if (i == 3 || i == 6) {
                continue;
            }
            if (!Character.isDigit(s[i])) {
                System.out.println("Invalid SSN");
                valid = false;
                break;
            }
        }
        if (valid) {
            System.out.println("Valid SSN");
        }
        
    }
}
