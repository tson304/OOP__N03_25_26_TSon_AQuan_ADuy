public class Recursion {

    
    public static int giaiThua(int n) {
        if (n <= 1) return 1;
        return n * giaiThua(n - 1);
    }

 
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void inDayFibonacci(int n) {
        System.out.print("Dãy Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}
