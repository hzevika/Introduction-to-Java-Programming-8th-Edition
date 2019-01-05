package Chapter14;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Havis
 */
class House implements Cloneable, Comparable<House>{
    private int id;
    private double area;
    private Date whenBuilt;

    public House() {
    }

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        this.whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    @Override
    public int compareTo(House o) {
        if (area > ((House)o).area) 
            return 1;
        else if(area > ((House)o).area)
            return -1;
        else
            return 0;
    }
    
}

public class Exercises4 {
    public static void main(String[] args){
        House house1 = new House(101, 2000);
        try {
            House house2 = (House) house1.clone();
            System.out.println("House 1 date built : "+house1.getWhenBuilt());
            System.out.println("House 2 date built : "+house2.getWhenBuilt());
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Exercises4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
