package Chapter14;
import java.util.Date;
/**
 *
 * @author Havis
 */
abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;
    
    protected GeometricObject(){
        dateCreated = new Date();
    }
    
    protected GeometricObject(String color, boolean filled){
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
    
    public static Object max(GeometricObject o1, GeometricObject o2 ) {
        if (o1.getArea() > o2.getArea())
            return o1;
        else
            return o2;
    }
}

class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
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
    public int compareTo(GeometricObject o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    } 

    @Override
    public String toString() {
        return super.toString()+"\nshape: rectangle\narea: "+getArea()+"\nperimeter: "+getPerimeter(); 
    }

    @Override
    public int compareTo(GeometricObject o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class Exercises1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10, "black", true);
        Circle c2 = new Circle(14, "pink", true);
        Rectangle r1 = new Rectangle(2, 8.2, "blue", true);
        Rectangle r2 = new Rectangle(6, 4.5, "green", false);
        
        System.out.println("The larger circle is : \n"+Circle.max(c1, c2).toString());
        System.out.println("\n");
        System.out.println("The larger rectangle is : \n"+Rectangle.max(r1, r2).toString());
    }
}
