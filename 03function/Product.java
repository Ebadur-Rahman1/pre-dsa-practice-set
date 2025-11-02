// 17. Product of two numbers using function
import java.util.Scanner;

class Product {
    public static int multiplyNumber(int x,int y){
        return x*y;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = multiplyNumber(a,b);
        System.out.println("Multiplication of "+ a + " and " + b + " is: "+ result);
        sc.close();
    }
}