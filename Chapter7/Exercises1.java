package Chapter7;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises1 {
    public static double sumMatrix(int[][] m){
        double summatrix = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                summatrix += m[i][j];
            }
        }
        return summatrix;
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
        
        System.out.println("Sum of the matrix is "+sumMatrix(matrix));
    }
    
}
