package Practice6.REVIEW;

public class Caller {
    private Incrementable callbackReference;
    public Caller(Incrementable cbr) {
        callbackReference = cbr;
    }

    public void go() {
        callbackReference.increment();
    }
}