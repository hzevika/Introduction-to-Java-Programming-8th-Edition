package Chapter8;
/**
 *
 * @author Havis
 */
class Stock{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    Stock(){
    
    }
    
    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    
    double getChangePercent(){
        return previousClosingPrice - currentPrice;
        
    }
    
    void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
    
    void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
}

public class Exercises2 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("JAVA", "Sun Microsystems Inc");
        stock1.setPreviousClosingPrice(4.5);
        stock1.setCurrentPrice(4.35);
        System.out.println("The price-change percentage is : "+stock1.getChangePercent());
    }
}
