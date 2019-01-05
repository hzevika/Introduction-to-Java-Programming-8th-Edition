package Chapter4;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1, positives = 0, negatives = 0, total = 0;
        double avg;
        System.out.print("Enter an int value, the program exits if the input is 0: ");
        while(number!=0){            
            number = input.nextInt();
            if (number<0) {
                negatives++;
            }else if(number>0){
                positives++;
            }
            total +=number;
        }
        avg = (double)total/(positives+negatives);
        System.out.println("The number of positives is "+positives);
        System.out.println("The number of negatives is "+negatives);
        System.out.println("The total is "+total);
        System.out.println("The average is "+avg);
    }
}