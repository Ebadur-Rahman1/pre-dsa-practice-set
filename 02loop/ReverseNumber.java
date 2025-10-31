// Print reverse of a number. (Only print no need to construct a new reversed number)
// % operator gives us last digit of a number or Remainder of a number.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        sc.close();
    }    
}