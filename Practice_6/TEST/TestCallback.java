package TEST;
import REVIEW.*;;

public class TestCallback {
    public static void test() {
        Callee c = new Callee();
        c.increment();
        Caller caller = new Caller(c.getCallbackReference());
        
        for (int i = 0; i < 10; i++) {
            caller.go();
        }
    }
}
