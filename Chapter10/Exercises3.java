package Chapter10;
/**
 *
 * @author Havis
 */

class MyInteger{
    private int value;

    public MyInteger() {
        
    }

    public MyInteger(int value) {
        this.value = value;
    }
    
    void setValue(int value){
        this.value = value;
    }
    
    int getValue(){
        return value;
    }
    
    boolean isEven(){
        boolean even = true;
        if (value%2!=0)
            even=false;
        return even;
    }
    
    static boolean isEven(int value){
        boolean even = true;
        if (value%2!=0)
            even=false;
        return even;
    }
    
    static boolean isEven(MyInteger my){
        boolean even = true;
        if (my.value%2!=0)
            even=false;
        return even;
    }
    
    boolean isOdd(){
        boolean odd = true;
        if(value%2==0)
            odd=false;
        return odd;
    }
    
    static boolean isOdd(int value){
        boolean odd = true;
        if(value%2==0)
            odd=false;
        return odd;
    }
    
    static boolean isOdd(MyInteger my){
        boolean odd = true;
        if (my.value%2==0)
            odd=false;
        return odd;
    }
            
    boolean isPrime(){
        boolean prime = true;
        if(value!=2 && value>2){
            for (int i = 2; i < value; i++) {
                if (value%i==0) {
                    prime=false;
                    break;
                }
            }
        }else if(value<2){
            prime = false;
        }
        return prime;
    }
        
    static boolean isPrime(int value){
        boolean prime = true;
        if(value!=2 && value>2){
            for (int i = 2; i < value; i++) {
                if (value%i==0) {
                    prime=false;
                    break;
                }
            }
        }else if(value<2){
            prime = false;
        }
        return prime;
    }   
    
    static boolean isPrime(MyInteger my){
        boolean prime = true;
        if(my.value!=2 && my.value>2){
            for (int i = 2; i < my.value; i++) {
                if (my.value%i==0) {
                    prime=false;
                    break;
                }
            }
        }else if(my.value<2){
            prime = false;
        }
        return prime;
    }
    
    static int parseInt(char[] c){
        int parseInt = 0;
        for (int i = 0; i < c.length; i++) {
            parseInt *= 10;
            parseInt += Character.getNumericValue(c[i]);
        }
        return parseInt;
    }
    
    static int parseInt(String s){
        int parseInt = 0;
        parseInt = Integer.parseInt(s);
        return parseInt;
    }
}

public class Exercises3 {
    public static void main(String[] args) {
        MyInteger MyInteger1 = new MyInteger();
        MyInteger MyInteger2 = new MyInteger(10);
        MyInteger1.setValue(11);
        
        System.out.println(  "MyInteger1 value is : "+MyInteger1.getValue()
                            +"\nMyInteger2 value is : "+MyInteger2.getValue());
        
        System.out.println(  "\nMyInteger1 is Even "+MyInteger1.isEven()
                            +"\nMyInteger1 is Odd "+MyInteger1.isOdd()
                            +"\nMyInteger1 is Prime "+MyInteger1.isPrime());
        
        System.out.println(  "\nMyInteger2 is Even "+MyInteger1.isEven(MyInteger2)
                            +"\nMyInteger2 is Odd "+MyInteger1.isOdd(MyInteger2)
                            +"\nMyInteger2 is Prime "+MyInteger1.isPrime(MyInteger2));
        
        System.out.println(  "\nInteger 987 is Even "+MyInteger1.isEven(987)
                            +"\nInteger 987 is Odd "+MyInteger1.isOdd(987)
                            +"\nInteger 987 is Prime "+MyInteger1.isPrime(987));
        
        char[] c = {'9','1'};
        String s = "2234";
        
        System.out.println(  "\nInteger Value from array of char "+MyInteger1.parseInt(c)
                            +"\nInteger Value from String "+MyInteger1.parseInt(s));
        
    }
}
