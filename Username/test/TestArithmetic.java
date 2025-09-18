package Username.test;

import Username.src.Const;
import Username.src.Plus;

public class TestArithmetic {
    // evaluate 1.1 + 2.2 + 3.3
    public static void main(String[] args) {
            Const n1 = new Const(1.1);
            Const n2 = new Const(2.2);
            Plus n3 = new Plus(n1, n2);
            Const n4 = new Const(3.3);
            Plus n5 = new Plus(n3, n4);
            Plus n6 = new Plus(new Const(4.4), new Const(5.5));
            System.err.println(n1.eval());
            System.err.println(n2.eval());
            System.err.println(n3.eval());
            System.err.println(n4.eval());
            System.err.println(n5.eval());
            System.err.println(n6.eval());
    }}
        