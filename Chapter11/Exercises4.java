package Chapter11;
import java.util.ArrayList;
/**
 *
 * @author Havis
 */
class MyStack extends ArrayList<Object>{
    
    public boolean isEmpty(){
        return super.isEmpty();
    }
    
    public int getSize(){
        return super.size();
    }
    
    public Object peek(){
        return super.get(getSize()-1);
    }
    
    public Object pop(){
        Object o = super.get(getSize()-1);
        super.remove(getSize()-1);
        return o;
    }
    
    public void push(Object o){
        super.add(o);
    }
    
    public int search(Object o){
        return super.lastIndexOf(o);
    }

    @Override
    public String toString() {
        return "Stack : "+super.toString();
    }
}

public class Exercises4 {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(10);
        ms.push("Twenty");
        ms.push(30);
        ms.push("Forty");
        System.out.println("The last object has been entered is : "+ms.peek());
        ms.push("Fifty");
        System.out.println(ms.toString());
        if (ms.search(90)>=0) {
            System.out.println("Search for \"90\" objects successfully.\nThe object on index : "+ms.search(90));
        }else{
            System.out.println("Object \"90\" was not found!");
        }
        ms.push(60);
        System.out.println("Object popped : "+ms.pop());
        System.out.println("Object popped : "+ms.pop());
        ms.push(70);
        ms.push("Eighty");
        ms.push(90);
        System.out.println(ms.toString());
        ms.push("Hundred");
        System.out.println(ms.toString());
        if (ms.search(90)>=0) {
            System.out.println("Search for \"90\" objects successfully.\n The object on index - "+ms.search(90));
        }else{
            System.out.println("Object \"90\" was not found!");
        }
    }
}
