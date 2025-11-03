// Write a program to convert Decimal to Binary

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        int remainder;
        int binaryNumber = 0;
        int i = 0;
        while(n>0){
            remainder = n % 2;
            binaryNumber = binaryNumber + remainder * (int)Math.pow(10,i);
            i++;
            n = n/2;
        }
        System.out.print("Converted binary: "+binaryNumber);

        sc.close();
    }
}