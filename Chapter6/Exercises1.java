package Chapter6;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises1 {
    public static int getBest(int[] scores, int n){
        int best = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(scores[i]<scores[j]){
                    best = scores[j];
                }else{
                    best = scores[i];
                }
            }
        }
        return best;
    }
    
    public static String getGrade(int score, int best){
        String grade = "";
        if(score >= best-10){
           grade ="A";
        }else if(score >= best-20){
           grade ="B";
        }else if(score >= best-30){
           grade ="C";
        }else if(score >= best-40){
           grade ="D";
        }
        return grade;
    }
    
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of student : ");
        n = input.nextInt();
        int[] scores = new int[n];
        System.out.print("Enter "+n+" scores : ");
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Studen "+i+" score is "+scores[i]+" and grade is "+getGrade(scores[i], getBest(scores, n)));
        }
    }
}
