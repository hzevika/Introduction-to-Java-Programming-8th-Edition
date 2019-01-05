package Chapter8;
/**
 *
 * @author Havis
 */
class Rectangle{
    private double height = 1;
    private double width = 1;
    
    Rectangle(){
        
    }
    
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    
    double getArea(){
        return height * width;
    }
    
    double getPerimeter(){
        return (2*height)+(2*width);
    }
    
    double getHeight(){
        return this.height;
    }
    
    double getWidth(){
        return this.width;
    }
}

public class Exercises1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 width is : "+rectangle1.getWidth()+"\n"
                            +"Rectangle 1 height is : "+rectangle1.getHeight()+"\n"
                            +"Rectangle 1 area is : "+rectangle1.getArea()+"\n"
                            +"Rectangle 1 perimeter is : "+rectangle1.getPerimeter()+"\n");
        
        System.out.println("Rectangle 2 width is : "+rectangle2.getWidth()+"\n"
                            +"Rectangle 2 height is : "+rectangle2.getHeight()+"\n"
                            +"Rectangle 2 area is : "+rectangle2.getArea()+"\n"
                            +"Rectangle 2 perimeter is : "+rectangle2.getPerimeter());
    }
 }
