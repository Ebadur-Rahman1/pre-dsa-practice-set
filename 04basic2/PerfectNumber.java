// Check given number is perfect number or not.
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.println("Given number is Perfect number ");
        }else {
            System.out.println("Given number is not a perfect number ");
        }
        sc.close();
    }
}