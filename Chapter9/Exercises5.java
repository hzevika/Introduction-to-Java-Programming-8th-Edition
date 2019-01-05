package Chapter9;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises5 {
    public static int[] count(String str){
        int count[] = new int[10];
        char[] charArray  = str.toCharArray();
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
            for (int j = 0; j < charArray.length; j++) {
                if (Character.getNumericValue(charArray[j]) == i) {
                    count[i]++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence with number : ");
        String str = input.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println("count "+i+" is "+count(str)[i]);
        }
    }
}
