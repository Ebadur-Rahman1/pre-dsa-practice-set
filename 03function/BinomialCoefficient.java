// 18. Binomial Coefficient ncr = n! / r!(n-r)! using function. 
import java.util.Scanner;

public class BinomialCoefficient {
    public static int fact(int number){
        int ans = 1;
        for(int i=1; i<=number; i++){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r ");
        int r = sc.nextInt();

        int result = fact(n) / (fact(r) * fact(n-r));
        System.out.println("Result is: " + result);
        sc.close();
    }
}