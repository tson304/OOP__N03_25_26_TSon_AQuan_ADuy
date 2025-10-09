package Username.test;

import Username.Controler.Callee;
import Username.Controler.Caller;

public class TestCallback {
    public static void main(String[] args) {
        Callee callee = new Callee();
        Callee c2= new Callee();    
        Caller caller = new Caller(callee);
        Caller caller2 = new Caller(c2);    

        caller.go();  // Gọi lần 1
        caller.go();  // Gọi lần 2
        caller2.go(); // Gọi lần 1 cho callee2
        caller2.go(); // Gọi lần 2 cho callee2
    }
}