package Chapter11;

import java.util.Date;

/**
 *
 * @author Havis
 */
class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreate;
    
    public GeometricObject(){
        dateCreate = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreate = new java.util.Date();
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
    
    public boolean getFilled(){
        return filled;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public String toString() {
        return "created on "+dateCreate+"\ncolor : "+color+" and filled : ";
    }    
}

class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double a = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        return a;
    }
    
    public double getPerimeter(){
        return side1+side2+side3;
    }
    
    public String toString(){
        return "Triangle: side1 = "+side1+" side2 = "+side2+" side3 "+side3;
    }
}

public class Exercises1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("Yellow");
        triangle.setFilled(true);
        
        System.out.println(  "\nTriangle area is : "+triangle.getArea()
                            +"\nTriangle perimeter is : "+triangle.getPerimeter()
                            +"\nTriangle color is : "+triangle.getColor()
                            +"\nTriangle color is : "+triangle.getFilled());
    }
}
