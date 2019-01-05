package Chapter13;

import java.util.Date;

/**
 *
 * @author Havis
 */
class IllegalTriangleException extends Exception{

    public IllegalTriangleException() {
        super();
    }
    public IllegalTriangleException(String msg) {
        super(msg);
    }
}

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

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        double s1, s2, s3;
        s1 = side2 + side3;
        s2 = side3 + side1;
        s3 = side1 + side2;
        if (s1 > side1 && s2 > side2 && s3 > side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }else{
            throw new IllegalTriangleException("The triangle violates the rules!");
        }
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

public class Exercises5 {
    public static void main(String[] args){
        try {
            Triangle triangle = new Triangle(1, 1.5, 1);
            triangle.setColor("Yellow");
            triangle.setFilled(true);

            System.out.println(  "\nTriangle area is : "+triangle.getArea()
                                +"\nTriangle perimeter is : "+triangle.getPerimeter()
                                +"\nTriangle color is : "+triangle.getColor()
                                +"\nTriangle color is : "+triangle.getFilled());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("");
        try {
            Triangle triangle = new Triangle(1, 5.5, 1);
            triangle.setColor("Yellow");
            triangle.setFilled(true);

            System.out.println(  "\nTriangle area is : "+triangle.getArea()
                                +"\nTriangle perimeter is : "+triangle.getPerimeter()
                                +"\nTriangle color is : "+triangle.getColor()
                                +"\nTriangle color is : "+triangle.getFilled());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
