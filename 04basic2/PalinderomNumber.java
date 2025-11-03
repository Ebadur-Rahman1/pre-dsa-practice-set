// Palindrom: a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.

import java.util.Scanner;
public class PalinderomNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int reverse = 0;
        int lastDigit;
        while(n>0){
            lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n/10;
        }
        if(originalNumber == reverse)
            System.out.print("Given number is palindrome.");
        else 
            System.out.print("Given number is not a palindrome.");

        sc.close();
    }
}