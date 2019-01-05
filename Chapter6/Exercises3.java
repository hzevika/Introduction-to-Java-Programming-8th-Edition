package Chapter6;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises3 {
    public static int[] sorting(int[] number){
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[i]<number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        return number;
    }
    public static void count(int[] number){
        for (int i = 0; i < number.length; i++) {
            int count = 1;
            for (int j = i+1; j < number.length; j++) {
                if(number[i]==number[j]){
                    i++;
                    count++;
                }
            }
            System.out.println(number[i]+" occurs "+count+" times");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[9];
        System.out.print("Enter the integers between 1 and 100 : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        count(sorting(number));
    }
}
