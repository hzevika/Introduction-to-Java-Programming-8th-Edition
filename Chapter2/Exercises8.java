package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an ASCII code : ");
        char code = (char)input.nextInt();
        int cdin = (int)code;
        
        System.out.println("The Characeter for ASCII code "+cdin+" is "+code);
    }
}
