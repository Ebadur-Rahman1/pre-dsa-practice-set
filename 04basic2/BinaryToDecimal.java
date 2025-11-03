// Convert binary to decimal
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        int original = n;
        int decimal = 0;
        int power = 0;

        // Validation (optional)
        int temp = n;
        boolean isBinary = true;
        while (temp > 0) {
            int d = temp % 10;
            if (d != 0 && d != 1) {
                isBinary = false;
                break;
            }
            temp /= 10;
        }

        if (!isBinary) {
            System.out.println("Invalid binary number!");
        } else {
            while (n > 0) {
                int lastDigit = n % 10;
                decimal += lastDigit * (int) Math.pow(2, power);
                power++;
                n /= 10;
            }
            System.out.println("Decimal value of " + original + " is: " + decimal);
        }

        sc.close();
    }
}