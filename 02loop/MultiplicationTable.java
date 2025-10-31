// WAP to print the multiplication table of a number N, entered by the user.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to print the table: ");
        int number = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }

        sc.close();
    }    
}
