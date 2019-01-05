package Chapter7;
/**
 *
 * @author Havis
 */
public class Exercises3 {
    public static int[][] sortRank(int[][] r){
        for (int i = 0; i < r[1].length; i++) {
            for (int j = 0; j < r[1].length; j++) {
                if (r[0][i]>r[0][j]) {
                    for (int k = 0; k < r.length; k++) {
                        int temp = r[k][i];
                        r[k][i] = r[k][j];
                        r[k][j] = temp;
                    }
                }
            }
        }
        return r;
    }
    public static void main(String[] args) {
        char[][] answer = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] rank = new int[2][answer.length];
        for (int i = 0; i < answer.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < 10; j++) {
                if (answer[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            rank[0][i] = correctCount;
            rank[1][i] = i;
        }
        rank = sortRank(rank);
        for (int j = 0; j < rank[0].length; j++) {
            System.out.println("Student "+rank[1][j]+"'s correct answer is "+rank[0][j]);   
        }
    }
}
