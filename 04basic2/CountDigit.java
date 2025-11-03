// count digit in a number
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(originalNumber + " Having "+ count +" digit.");

        sc.close();
    }
}