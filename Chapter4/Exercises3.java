package Chapter4;
/**
 *
 * @author Havis
 */
public class Exercises3 {
    public static void main(String[] args) {
        System.out.println("Kilograms\t Pounds");
        for (int i = 1; i < 200; i+=2) {
            System.out.println(i+"\t\t "+String.format("%.1f", (i*2.2)));
        }
    }
}
