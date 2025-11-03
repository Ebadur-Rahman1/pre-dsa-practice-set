// Calculate x power y

import java.util.Scanner;

public class XPOWERY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        int result = 1;
        for(int i=1; i<=power; i++){
            result = result * base;
        }
        System.out.println("Ans: "+result);
        System.out.print("Ans by using built in function : "+ Math.pow(base,power));
        sc.close();
    }
}
