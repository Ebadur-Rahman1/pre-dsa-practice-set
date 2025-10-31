// Print sum of first n natural number.
import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1; i<=n; i++){
        sum = sum+i;
    }
    System.out.print("Sum of first natural number till "+ n +" is:"+ sum);
    sc.close();
    }
}