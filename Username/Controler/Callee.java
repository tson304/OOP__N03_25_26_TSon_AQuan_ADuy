package Username.Controler;

public class Callee implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println("Callee increments i to " + i);
    }

  
}
