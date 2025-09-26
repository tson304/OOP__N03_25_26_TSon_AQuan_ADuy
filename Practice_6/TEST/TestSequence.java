package TEST;
import REVIEW.*;

public class TestSequence {
    public static void test() {
        Sequence s = new Sequence(10);

        for (int i = 0; i < 10; i++) {
            s.add(Integer.toString(i));
        }

        Selector s1 = s.getSelector();
    
        while (!s1.end()) {
            System.out.println(s1.current());
            s1.next();
        }
    }
}
