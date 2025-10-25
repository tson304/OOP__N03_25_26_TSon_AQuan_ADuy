package week6;

public class TestApp {
     public static void main(String[] args) {
        Callee callee = new Callee();
        Caller caller = new Caller(callee);
        for (int i = 0; i < 10; i++) {
            caller.go();
        }

        OuterPublic outer = new OuterPublic();
        OuterPublic.InnerPublic inner = outer.new InnerPublic();
        inner.print();

        OuterPrivate outerP = new OuterPrivate();
        outerP.callInner();
    }

}
