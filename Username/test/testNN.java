package Username.test;

import Username.hoc.NNCollection;
import Username.hoc.NameNumber;

public class testNN {
    public static void main(String[] args) {
        NNCollection collection = new NNCollection();

        collection.insert(new NameNumber("Anh","0374250112"));
        collection.insert(new NameNumber("Quan","0012345578"));

        System.err.println(collection.findNumber("Anh"));
        System.err.println(collection.findNumber("Quan"));
        System.err.println(collection.findNumber("Le"));

    }
}
