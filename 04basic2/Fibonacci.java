// Print Fibonacci series (1, 1, 2, 3, 5, 8, 13...)

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term of fibonacci you want to print: ");
        int t = sc.nextInt();
        int firstTerm = 1;
        int secondTerm = 1;

        // print first two terms first
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= t; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        sc.close();
    }
}
