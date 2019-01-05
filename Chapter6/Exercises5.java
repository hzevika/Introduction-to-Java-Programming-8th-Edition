package Chapter6;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises5 {
    public static int[] disctinct(int[] number){
        int[] num;
        boolean exist;
        int countDistinct = 0;
        for (int i = 0; i < number.length; i++) {
            exist = false;
            if (countDistinct != 0 ) {
                for (int j = 0; j < countDistinct; j++) {
                    if (number[i]==number[j]) {
                        exist = true;
                    }
                }
            }
            if (!exist) {
                number[countDistinct] = number[i];
                countDistinct++;
            }
        }
        num = new int[countDistinct];
        System.arraycopy(number, 0, num, 0, countDistinct);
        return num;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        
        number = disctinct(number).clone();
        
        System.out.print("The distinct numbers are : ");
        for (int i = 0; i < number.length ; i++) {
            System.out.print(number[i]+"  ");
        }
    }
}
