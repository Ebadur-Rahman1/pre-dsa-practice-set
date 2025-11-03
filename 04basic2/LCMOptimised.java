// using Euclidean algorithm

import java.util.Scanner;

public class LCMOptimised {

    // Iterative Euclidean algorithm
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // a is non-negative gcd
    }

    // lcm using gcd; returns 0 if either input is 0
    public static long lcm(int a, int b) {
        if (a == 0 || b == 0) return 0L;
        int g = gcd(a, b);
        // divide first to avoid overflow: (a/g) * b
        return (long)(a / g) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int g = gcd(a, b);
        long l = lcm(a, b);

        System.out.println("GCD (HCF) = " + g);
        System.out.println("LCM = " + l);

        sc.close();
    }
}
