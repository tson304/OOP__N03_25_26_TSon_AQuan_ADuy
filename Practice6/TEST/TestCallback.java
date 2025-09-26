package Practice6.TEST;
import Practice6.REVIEW.*;;

public class TestCallback {
    public static void main(String[] args) {
        Callee c = new Callee();
        c.increment();
        Caller caller = new Caller(c.getCallbackReference());
        
        for (int i = 0; i < 10; i++) {
            caller.go();
        }
    }
}
