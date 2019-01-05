package Chapter14;

import java.util.Date;

/**
 *
 * @author Havis
 */
interface Colorable{
    public abstract void howToColor();
}

abstract class GeometricObject3{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;
    
    protected GeometricObject3(){
        dateCreated = new Date();
    }
    
    protected GeometricObject3(String color, boolean filled){
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

class Square extends GeometricObject3 implements Colorable{
    private double side;
    private boolean colorable;
    
    public Square() {
    }

    public Square(double side, boolean colorable) {
        this.side = side;
        this.colorable = colorable;
    }

    public Square(double side, boolean colorable, String color, boolean filled) {
        super(color, filled);
        this.side = side;
        this.colorable = colorable;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public boolean isColorable() {
        return colorable;
    }

    public void setColorable(boolean colorable) {
        this.colorable = colorable;
    }
    
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return super.toString()+"\nshape: Square\narea: "+getArea()+"\nperimeter: "+getPerimeter();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side.");
    }
    
}
public class Exercises3 {
    public static void main(String[] args) {
        Square[] sq = new Square[5];
        sq[0] = new Square(5, true, "blue", true);
        sq[1] = new Square(6, false, "black", true);
        sq[2] = new Square(3, false, "white", false);
        sq[3] = new Square(4, true, "red", true);
        sq[4] = new Square(3, true, "green", false);
        
        for (int i = 0; i < sq.length; i++) {
            if (sq[i].isColorable()) {
                sq[i].howToColor();
            }
        }
            
    }
}
