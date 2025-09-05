package Username.test;

import Username.src.Time;

public class testTime {
    public static void main(String[] args) {
        Time t1 =new Time(1,20,40);

        System.err.println(t1);
        t1.setTime(0, 0, 0);
        System.err.println(t1);
    }

    
}