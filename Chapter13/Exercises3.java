package Chapter13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Havis
 */
public class Exercises3 {
    public static void main(String[] args) {
        int[] integerArray = new int[100];
        for (int i = 0; i < 100; i++) {
            integerArray[i] = new Random().nextInt(1000);
        }        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index of the array (max index 99) : ");
        int index = input.nextInt();
        try {
            System.out.println("The value of index-"+index+" is "+integerArray[index]);
        } catch (Exception e) {
            System.out.println("Out of Bounds");
        }
    }
}
