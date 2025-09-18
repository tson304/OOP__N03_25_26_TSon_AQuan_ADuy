package Username.src;

public class Plus extends Binop {
    public Plus(Node l, Node r) {
        super(l, r); // gọi constructor của Binop
    }

    @Override
    public double eval() {
        return lChild.eval() + rChild.eval();
        // lChild và rChild là protected nên subclass truy cập được
    }
} 
