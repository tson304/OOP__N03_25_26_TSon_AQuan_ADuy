public class testRecursion {
    public static void Recursion() {
        System.out.println("RECURSION CALL");
        Recursion.f(new Object[] {"one", "two", "three"}, 0);
        Recursion.f(new Object[] {1, "two", 3.5}, 0);
        Recursion.f(new Object[] {"one", new Recursion(), 3.5}, 0);
    }
}
