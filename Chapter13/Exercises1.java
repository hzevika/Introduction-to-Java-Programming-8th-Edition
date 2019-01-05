package Chapter13;
import java.lang.NumberFormatException;
/**
 *
 * @author Havis
 */
public class Exercises1 {
    public static boolean isNumeric(String str){
        try {
            double d = Double.parseDouble(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean available = true;
        double result = 0;
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        for (int i = 0; i <= 2; i+=2) {
            if (!isNumeric(args[i])) {
                System.out.println("Wrong input : "+args[i]);
                available = false;
            }
        }
        if (available) {
            switch (args[1].charAt(0)){
                case '+': result = Double.parseDouble(args[0]) + Double.parseDouble(args[2]);
                    break;
                case '-': result = Double.parseDouble(args[0]) - Double.parseDouble(args[2]);
                    break;
                case '*': result = Double.parseDouble(args[0]) * Double.parseDouble(args[2]);
                    break;
                case '/': result = Double.parseDouble(args[0]) / Double.parseDouble(args[2]);
            }
            System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+result);
        }
    }
}
