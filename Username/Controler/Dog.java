package Username.Controler;

import Username.Interface.animal;
import Username.Interface.leg;

public class Dog implements animal,leg{
    @Override
    public void sound() {
        System.out.println("Dog say: Woof!");
    }

    @Override
    public void showLeg() {
        System.out.println("Dog have 4 leg.");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }
}
