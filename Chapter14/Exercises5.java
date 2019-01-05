package Chapter14;
import java.util.Date;
/**
 *
 * @author Havis
 */
abstract class GeometricObject4{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;
    
    protected GeometricObject4(){
        dateCreated = new Date();
    }
    
    protected GeometricObject4(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on "+dateCreated+"\ncolor: "+color+" and filled "+filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
}

class Circle4 extends GeometricObject4 implements Comparable<Circle4>{
    private double radius;

    public Circle4() {
    }

    public Circle4(double radius) {
        this.radius = radius;
    }

    public Circle4(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public double getDiameter(){
        return 2 * radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString()+"\nshape: circle\narea: "+getArea()+"\nperimeter: "+getPerimeter(); 
    }

    @Override
    public int compareTo(Circle4 o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean equals(Circle4 c4){
        if (this.radius == c4.getRadius())
            return true;
        else 
            return false;
    }
}

public class Exercises5 {
    public static void main(String[] args) {
        Circle4 c1 = new Circle4(20, "black", true);
        Circle4 c2 = new Circle4(21, "white", false);
        
        System.out.println("c1 is equals to c2? "+c1.equals(c2));
        
        c2.setRadius(20);
        
        System.out.println("c1 is equals to c2? "+c1.equals(c2));
    }
}
