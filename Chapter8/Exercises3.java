package Chapter8;

import java.util.Date;

/**
 *
 * @author Havis
 */
public class Exercises3 {
    public static void main(String[] args) {
        System.currentTimeMillis();
        Date date1 = new Date();
        
        date1.setTime(10000);
        System.out.println("Date and Time is : "+date1.toString());
        date1.setTime(100000);
        System.out.println("Date and Time is : "+date1.toString());
        date1.setTime(1000000);
        System.out.println("Date and Time is : "+date1.toString());
        date1.setTime(10000000);
        System.out.println("Date and Time is : "+date1.toString());
        date1.setTime(100000000);
        System.out.println("Date and Time is : "+date1.toString());
        date1.setTime(1000000000L);
        System.out.println("Date and Time is : "+date1.toString());
        date1.setTime(10000000000L);
        System.out.println("Date and Time is : "+date1.toString());
        date1.setTime(100000000000L);
        System.out.println("Date and Time is : "+date1.toString());
    }
}
