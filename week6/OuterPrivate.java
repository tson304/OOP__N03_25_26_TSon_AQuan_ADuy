package week6;

public class OuterPrivate {
    private class Innerprivate{
        public void print(){
            System.out.println("Day la inner private class");
        }
    }
    public void callInner(){
        Innerprivate ip = new Innerprivate();
    ip.print();   
 }
}
