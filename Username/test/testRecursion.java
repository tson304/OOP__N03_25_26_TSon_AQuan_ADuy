package Username.test;

import java.util.Scanner;

public class testRecursion{
    public static int fibo(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return fibo(n-1)+fibo(n-2);


    }
  
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.err.println("Nhap so tu nhien:");
        n=sc.nextInt();
        System.err.println("Fibonacci tu 1 den "+ n +" la: " +fibo(n));
        sc.close();

    }
}