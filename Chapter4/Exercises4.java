package Chapter4;
/**
 *
 * @author Havis
 */
public class Exercises4 {
    public static void main(String[] args) {
        System.out.println("Miles\t\t Kilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"\t\t "+String.format("%.3f", (i*1.609)));
        }
    }
}
