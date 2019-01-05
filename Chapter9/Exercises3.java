package Chapter9;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password : ");
        String pass = input.nextLine();
        char[] pw = pass.toCharArray();
        boolean valid = true;
        //A password must have at least eight character.
        //A password consist of only letter and digits.
        //A password must contain at least two digits.
        
        if (pw.length >= 8) {
            int digit = 0;
            for (int i = 0; i < pw.length; i++) {
                if (!Character.isDigit(pw[i]) && !Character.isLetter(pw[i])) {
                    valid = false;
                    System.out.println("Invalid Password!");
                }else if(Character.isDigit(pw[i])){
                    digit++;
                }
            }
            if (digit<2) {
                valid=false;
                System.out.println("Invalid Password!");
            }
        }else{
            valid = false;
            System.out.println("Invalid Password!");
        }
        if (valid) {
            System.out.println("Valid Password");
        }
    }
}
