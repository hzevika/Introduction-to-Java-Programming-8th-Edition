package Chapter10;

import java.util.Scanner;

/**
 *
 * @author Havis
 */
class MyPrime{
    private int value;

    public MyPrime() {
        
    }

    public MyPrime(int value) {
        this.value = value;
    }
    
    void setValue(int value){
        this.value = value;
    }
    
    int getValue(){
        return value;
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
    
    static boolean isPrime(MyPrime my){
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
}

class StackOfIntegers{
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }
    
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }
    
    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length*2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    
    public int pop(){
        return elements[--size];
    }
    
    public int peek(){
        return elements[size-1];
    }
    
    public boolean empty(){
        return size == 0;
    }
    
    public int getSize(){
        return size;
    }

    public int[] getElements() {
        return elements;
    }
}


public class Exercises5 {
    public static void sortStack(int[] s, int size, String type){
        if (type == "ASC") {
            for (int i = 0; i < size; i++) {
                for (int j = i+1; j < size; j++) {
                    if (s[j]<s[i]) {
                        int temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }
        }else if(type == "DESC"){
            for (int i = 0; i < size; i++) {
                for (int j = i+1; j <= size; j++) {
                    if (s[j]>s[i]) {
                        int temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackOfIntegers stack = new StackOfIntegers();
        System.out.print("Enter a positive integer : ");
        int positiveInteger = input.nextInt();
        
        while(positiveInteger != 1){
            for (int j = 0; j <= positiveInteger; j++) {
                if (MyPrime.isPrime(j)) {
                    if (positiveInteger%j==0){
                        stack.push(j);
                        positiveInteger /= j;
                    }
                }
            }
        }
        
        sortStack(stack.getElements(), stack.getSize(), "ASC");
        System.out.println("The prime factors are");
        for (int i = 0; i < stack.getSize(); i++) {
            System.out.print(stack.getElements()[i]+" ");
        }
        System.out.println("\nOr");
        sortStack(stack.getElements(), stack.getSize(), "DESC");
        for (int i = 0; i < stack.getSize(); i++) {
            System.out.print(stack.getElements()[i]+" ");
        }
    }
}
