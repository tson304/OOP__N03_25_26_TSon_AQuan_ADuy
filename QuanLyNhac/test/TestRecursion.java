public class TestRecursion {
    public static void test(){
        Recursion.f(new Object[] {"one", "two", "three"}, 0);
        Recursion.f(new Object[] {1, "two", 3.5}, 0);
        Recursion.f(new Object[] {"one", new Recursion(), 3.5}, 0);
    }

    public static void main(String[] args) {
        test();
    }
}
