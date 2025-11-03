// An Armstrong number is a number that is equal to the sum of its own digits,
// each raised to the power of the total number of digits

import java.util.Scanner;
public class ArmstrongNumber {
    public static int countDigit(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int count = countDigit(n);
        int sum = 0;
        int lastDigit;
        while(n>0){
            lastDigit = n % 10;
            sum = sum + (int)Math.pow(lastDigit, count);
            n = n/10;
        }
        if(originalNumber == sum)
            System.out.println("Given number is armstrong number");
        else 
            System.out.println("Given number is not an armstrong number");

        sc.close();
    }
}