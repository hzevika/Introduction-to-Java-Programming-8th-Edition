package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes : ");
        int minutes = input.nextInt();
        int days = minutes / 1440;
        int years = days / 365;
        days %= 365;
        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
    }
}
