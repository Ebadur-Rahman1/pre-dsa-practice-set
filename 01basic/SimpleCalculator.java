import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        int a = sc.nextInt();
        System.out.println("Enter second operand: ");
        int b = sc.nextInt();
        System.out.println("Enter operator (+,-,*,/)");
        char op = sc.next().charAt(0);
        int result;

        switch(op){
            case '+':
            result = a+b;
            System.out.println("Result: "+ result);
            break;

            case '-':
            result = a-b;
            System.out.println("Result: "+ result);
            break;

            case '*':
            result = a*b;
            System.out.println("Result: "+ result);
            break;

            case '/':
            result = a/b;
            System.out.println("Result: "+result);
            break;

            default:
            System.out.println("Invalid Operator ");
        }
        sc.close();
    }
}
