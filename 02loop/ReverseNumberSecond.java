// reverse a number by constructing a new number.
import java.util.Scanner;

public class ReverseNumberSecond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int lastDigit;
        int newNumber=0;
        while(n>0){
            lastDigit = n % 10;
            newNumber = newNumber * 10 + lastDigit;
            n = n/10;
        }
        System.out.println(newNumber);
        sc.close();
    }
}