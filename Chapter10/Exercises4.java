package Chapter10;

/**
 *
 * @author Havis
 */
class MyPoint{
    private double x;
    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }
    
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    void setX(double x){
        this.x = x;
    }
    
    void setY(double y){
        this.y = y;
    }
    
    double getX(){
        return x;
    }
    
    double getY(){
        return y;
    }
    
    double distance(MyPoint p){
        return (double)Math.pow(Math.pow(p.x-this.x, 2)+Math.pow(p.y-this.y, 2), 0.5);
    }
}

public class Exercises4 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);
        
        System.out.println(  "Coordinates of point1 are (x and y) "+point1.getX()+" , "+point1.getY()
                            +"\nCoordinates of point2 are (x and y) "+point2.getX()+" , "+point2.getY()
                            +"\nThe distance between these points is : "+point1.distance(point2));
    }
}
