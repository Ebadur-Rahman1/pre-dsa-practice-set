// WAP to print all prime factors of a number.
import java.util.Scanner;

public class PrimeFactor {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int j=2; j*j<=n; j++){
            if(n % j == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        System.out.print("Prime factors of " + n + " are: ");
        for(int i=2; i<=n; i++){
            if(n%i==0 && isPrime(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}