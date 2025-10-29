// Print Even Odd without using modulus operator.
// Divide by 2 and then multiply by 2 equal to given number

import java.util.Scanner;

public class EvenOddSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer number ");
        int n = sc.nextInt();
        if (n / 2 * 2 == n) {
            System.out.println(n + " is an even number ");
        } else {
            System.out.println(n + " is an odd number ");
        }
        sc.close();
    }
}
