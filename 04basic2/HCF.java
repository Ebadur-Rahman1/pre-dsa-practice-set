// Calculate HCF of two number

import java.util.Scanner;
public class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        for(int h=(a<b?a:b); h >= 1; h--){ 
            if(a%h==0 && b%h==0){
                System.out.print("HCF of "+ a + " and " + b + " = "+ h);
                break;
            }
        }
        sc.close();
    }
}
