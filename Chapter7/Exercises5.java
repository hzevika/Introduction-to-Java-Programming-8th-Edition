package Chapter7;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][][] matrix = new double[3][3][3];
        
        for (int i = 0; i < (matrix.length-1); i++) {
            System.out.print("Enter matrix"+(i+1)+" : ");
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix[0][0].length; k++) {
                   matrix[i][j][k] = input.nextDouble();
                }
            }
        }
        
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0][0].length; j++) {
                for (int k = 0; k < (matrix.length-1); k++) {
                    matrix[2][i][j] += matrix[k][i][j];
                }
            }
        }
        
        System.out.println("The matrices are added as follows : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix[0][0].length; k++) {
                    System.out.print(matrix[j][i][k]+" ");
                }
                if(i == 1){
                    if(j==0)
                        System.out.print("\t+\t");
                    else if(j==1)
                        System.out.print("\t=\t");
                }else{
                    System.out.print("\t\t");
                }
            }
            System.out.println("");
        }
    }
}
