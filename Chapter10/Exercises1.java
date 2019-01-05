package Chapter10;

/**
 *
 * @author Havis
 */
class Time{
    private long hour;
    private long minute;
    private long second;

    public Time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int)(totalSeconds % 60);
        setSecond(currentSecond);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        setMinute(currentMinute);
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        setHour(currentHour);
    }
    
    public Time(long elapseTime){
        setTime(elapseTime);
    }
    
    public Time(long hour, long minute, long second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    void setHour(long hour){
        this.hour = hour;
    }
    
    void setMinute(long minute){
        this.minute = minute;
    }
    
    void setSecond(long second){
        this.second = second;
    }
    
    long getHour(){
        return this.hour;
    }
    
    long getMinute(){
        return this.minute;
    }
    
    long getSecond(){
        return this.second;
    }
    
    void setTime(long elapseTime){
        long totalMilliseconds = elapseTime;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int)(totalSeconds % 60);
        setSecond(currentSecond);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        setMinute(currentMinute);
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        setHour(currentHour);
    }
    
}
public class Exercises1 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        
        System.out.println("Current time is "+time1.getHour()+":"+time1.getMinute()+":"+time1.getSecond()+" GMT");
        System.out.println("Other time is "+time2.getHour()+":"+time2.getMinute()+":"+time2.getSecond()+" GMT");
                
    }
}