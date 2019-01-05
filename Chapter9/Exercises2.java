package Chapter9;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        
        System.out.print("Enter first string : ");
        str1 = input.nextLine();
        System.out.print("Enter second string : ");
        str2 = input.nextLine();
        
        if (str2.indexOf(str1) == 0) {
            System.out.println(str1+" is substring of "+str2);
        }else{
            System.out.println(str1+" isn't substring of "+str2);
        }
    }
}
