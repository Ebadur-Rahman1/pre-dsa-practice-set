// Even odd using bitwise operator
// Even numbers always end with a 0 in the last bit (e.g., ...10, ...100, ...1000).
// Odd numbers always end with a 1 in the last bit (e.g., ...11, ...101, ...1001).


import java.util.Scanner;

public class EvenOddThird {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer value ");
        int n = sc.nextInt();
        if((n&1) == 0){
            System.out.println(n + " is an even number");
        } else{
            System.out.println(n + " is an odd number");
        }
        sc.close();
    }    
}
