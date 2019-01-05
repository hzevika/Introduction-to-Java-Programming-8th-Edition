package Chapter7;
/**
 *
 * @author Havis
 */
public class Exercises4 {
    public static int[][] countTotalHours(int[][] wh){
        int[][] totalHours = new int[wh.length][2];
        for (int i = 0; i < wh.length; i++) {
            int tHours = 0;
            for (int j = 0; j < wh[i].length; j++) {
                tHours += wh[i][j];
            }
            totalHours[i][0] = i;
            totalHours[i][1] = tHours;
        }
        return totalHours;
    }
    
    public static void sortTotalHours(int[][] th){
        for (int i = 0; i < th.length; i++) {
            for (int j = 0; j < th.length; j++) {
                if (th[i][1]>th[j][1]) {
                    for (int k = 0; k < th[0].length; k++) {
                        int temp = th[i][k];
                        th[i][k] = th[j][k];
                        th[j][k] = temp;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] weeklyHours = {{2,4,3,4,5,8,8},
                               {7,3,4,3,3,4,4},
                               {3,3,4,3,3,2,2},
                               {9,3,4,7,3,4,1},
                               {3,5,4,3,6,3,8},
                               {3,4,4,6,3,4,4},
                               {3,7,4,8,3,8,4},
                               {6,3,5,9,2,7,9}};
        
        int[][] totalHours = new int[weeklyHours.length][2];
        totalHours = countTotalHours(weeklyHours);
        sortTotalHours(totalHours);
        
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee "+totalHours[i][0]+" total weekly hours is "+totalHours[i][1]);
        }
    }
}
