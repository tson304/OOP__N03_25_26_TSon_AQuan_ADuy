package week6;

public class Caller{
    private Incrementable callbaclReference;
    public Caller(Incrementable cbr){
        callbaclReference = cbr;
    }
    public void go(){
        callbaclReference.increment();
    }}
