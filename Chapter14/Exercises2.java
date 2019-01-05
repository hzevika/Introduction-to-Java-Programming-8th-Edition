package Chapter14;

import java.util.Date;

/**
 *
 * @author Havis
 */
abstract class GeometricObject2{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;
    
    protected GeometricObject2(){
        dateCreated = new Date();
    }
    
    protected GeometricObject2(String color, boolean filled){
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

class Circle2 extends GeometricObject2{
    private double radius;

    public Circle2() {
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
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

}

class ComparableCircle extends Circle2 implements Comparable<ComparableCircle>{

    public ComparableCircle() {
    }
    
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius,color, filled);
    }
    
    
    @Override
    public int compareTo(ComparableCircle o) {
        if(super.getArea() > o.getArea())
            return 1;
        else if(super.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

}

public class Exercises2 {
    public static void main(String[] args) {
        ComparableCircle cc1 = new ComparableCircle(10, "black", true);
        ComparableCircle cc2 = new ComparableCircle(11, "white", true);
        
        if (cc1.compareTo(cc2) == 1) {
            System.out.print(cc1.toString());
        }else if(cc1.compareTo(cc2) == -1){
            System.out.println(cc2.toString());
        }else{
            System.out.println("cc1 and cc2 have the same area.");
        }
    }
}
