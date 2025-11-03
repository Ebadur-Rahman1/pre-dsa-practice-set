// Sum of digit
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int sum = 0;
        int lastDigit;
        while(n>0){
            lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n/10;
        }
        System.out.println("Sum of digit: "+ sum);
        sc.close();
    }
}
