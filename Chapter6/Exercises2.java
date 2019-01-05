package Chapter6;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises2 {
    public static void reverse(int[] number){
        int j = 10;
        for (int i = 0; i < 5; i++) {
            j--;
            int temp = number[i];
            number[i] = number[j];
            number[j] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        System.out.print("Enter ten integer : ");
        for (int i = 0; i < 10; i++) {
            number[i] = input.nextInt();
        }
        reverse(number);
        System.out.print("The reverse number is ");
        for (int i = 0; i < 10; i++) {
            System.out.print(number[i]+"  ");
        }
    }
}
