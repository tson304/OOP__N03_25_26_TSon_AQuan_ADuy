public class Recursion {
    static void f(Object[] x, int i) {
        if (i < x.length) {
            System.out.println(x[i]);
            f(x, i + 1);
        }
    }
}
