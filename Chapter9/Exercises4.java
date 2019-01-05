package Chapter9;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises4 {
    public static int count(String str, char c){
        int count = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length() ; i++) {
            if (c == charArray[i]) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dataIn,sentence;
        char[] c;
        System.out.print("Enter the sentence and a character at the end: ");
        dataIn = input.nextLine();
        sentence = dataIn.substring(0, dataIn.length()-2);
        c = dataIn.substring(dataIn.length()-1).toCharArray();
        System.out.println("\""+sentence+"\" contains "+count(sentence, c[0])+" letters "+c[0]);
        
    }
}
