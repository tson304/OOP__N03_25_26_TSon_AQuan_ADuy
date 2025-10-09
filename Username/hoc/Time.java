package Username.hoc;

public class Time{
    private int hour;
    private int minute;
    private int second;

   
    
    public Time(){
         setTime(0,0,0);
    }
    public Time(int hour){
        setTime(hour,0,0);
    }
    public Time(int hour, int minute){
         setTime(hour,minute,0);
    }
    public Time(int hour, int minute, int second){
        setTime(hour,minute,second);
    }
   public Time setTime(int h,int m,int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
        return this;
   }
   Time setHour(int h){
        hour =((h>=0&&h<24)?h:0);
        return this;

   }
   Time setMinute(int m){
        minute=((m>=0&&m<60)?m:0);
        return this;
   }
   Time setSecond(int s){
        second=((s>=0&&s<60)?s:0);
        return this;
   }
   int getHour(){
    return hour;
   }
   int getMinute(){
    return minute;
   }
   int getSecond(){
    return second;
   }
   @Override
   public String toString(){
    return  (( hour == 12 || hour == 0 ) ? 12 : hour % 12 ) + ":" + ( minute < 10 ? "0" : "" ) + minute + ":" + ( second < 10 ? "0" : "" ) + second + ( hour < 12 ? " AM" : " PM" );
   }
}