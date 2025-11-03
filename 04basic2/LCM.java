// Calculate LCM of two numbers
// For faster calculation Use GCD

import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        for(int l = a>b?a:b; l<=a*b; l = l + (a>b?a:b)){
            if(l%a == 0 && l%b==0){
                System.out.print("LCM of "+ a + " and " + b +" is: "+ l);
                break;
            }
        }

        sc.close();
    }    
}