package Chapter4;
/**
 *
 * @author Havis
 */
public class Exercises5 {
    public static void main(String[] args) {
        int pounds = 20;
        System.out.println("Kilograms\t Pounds \t Pounds \t Kilograms");
        for (int i = 1; i < 200; i+=2) {
            System.out.println(i+"\t\t "+String.format("%.1f", (i*2.2))+"\t\t "+pounds+" \t\t "+String.format("%.2f", (pounds*0.4545)));
            pounds += 5;
        }
    }
}
