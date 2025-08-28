import java.util.Random;

public class randNum {
    public static float randNum() {
        Random rand = new Random();
        float num = 1 + rand.nextFloat() * (99 - 1);
        return num;
    }

    public static void main(String[] args) {
        System.out.println(randNum());
    }
}