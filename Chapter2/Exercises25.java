package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Open the time zone offset to GMT : ");
        long offset = input.nextLong();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24) + offset;
        
        System.out.println("The current time is "+ currentHour + ":"
        + currentMinute + ":" + currentSecond + " GMT");
    }
}
