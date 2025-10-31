// keep entering number untill user enter multiple of 10.
import java.util.Scanner;

public class KeepEnter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("Enter a number ");
            n = sc.nextInt();
        }while(n%10 != 0);
        System.out.println("You have entered multiple of 10.");
        sc.close();
    }
}