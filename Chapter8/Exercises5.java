package Chapter8;
import java.util.*;
/**
 *
 * @author Havis
 */
public class Exercises5 {
    public static void main(String[] args) {
        GregorianCalendar gCalendar = new GregorianCalendar();
        
        System.out.println("Year : "+gCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Month : "+gCalendar.get(GregorianCalendar.MONTH));
        System.out.println("Day : "+gCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        
        System.out.println("");
        
        gCalendar.setTimeInMillis(1234567898765L);
        System.out.println("Year : "+gCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Month : "+gCalendar.get(GregorianCalendar.MONTH));
        System.out.println("Day : "+gCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
