package Controller;

import Interfaces.Animal;
import Interfaces.HandInterface;
import Interfaces.LegInterface;

public class Cat implements Animal, HandInterface, LegInterface {

    public void test() {
        System.out.println("Meow~");
    }

    public void walk() {
        System.out.println("The cat is walking quietly.");
    }

    public void grab() {
        System.out.println("The cat grabs with paw.");
    }

    public void noOfLegs() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void noOfHands() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
 }
}

