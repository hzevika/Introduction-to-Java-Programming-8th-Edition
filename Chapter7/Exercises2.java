package Chapter7;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises2 {
    public static double sumMajorDiagonal(int[][] m){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
                sum += m[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(matrix));
    }
}
