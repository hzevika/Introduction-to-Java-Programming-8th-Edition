package Chapter6;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises4 {
    public static int getLowerThanAverage(int[] number, double avg){
        int lower = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]>0 && number[i]<avg){
                lower++;
            }
        }
        return lower;
    }
    
    public static int getHigherThanAverage(int[] number, double avg){
        int higher = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]>=avg && number[i]<=10){
                higher++;
            }
        }
        return higher;
    }
    
    public static double getAverage(int[] number, int invalid){
        double avg = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]>0 && number[i]<10){
                avg += number[i];
            }
        }
        avg /= (number.length)-invalid;
        return avg;
    }
    public static int getInvalid(int[] number){
        int invalid=0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]<0 || number[i]>10){
                invalid++;
            }
        }
        return invalid;
    }
    public static void checkInvalid(int invalid){
        if (invalid == 0) {
            System.out.println("There is no invalid input");
        }else{
            System.out.println("There are "+invalid+" invalid input");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        System.out.print("Enter "+number.length+" scores (maximum score is 10) : ");
        for (int i = 0; i < 10; i++) {
            number[i] = input.nextInt();
        }
        double avg = getAverage(number, getInvalid(number));
        System.out.println("Average is "+avg);
        System.out.println("There are "+getHigherThanAverage(number, avg)+" number that are higher than th average");
        System.out.println("There are "+getLowerThanAverage(number, avg)+" number that are lower than th average");
        checkInvalid(getInvalid(number));
    }
}
