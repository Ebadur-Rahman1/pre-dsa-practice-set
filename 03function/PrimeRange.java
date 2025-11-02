// Print all primes in range (between two number).
import java.util.Scanner;

public class PrimeRange {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int j=2; j<n; j++){
            if(n % j ==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number ");
        int start = sc.nextInt();
        System.out.print("Enter second number ");
        int end = sc.nextInt();
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}