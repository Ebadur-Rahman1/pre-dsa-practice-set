// 1 
// 62 
// 1073 
// 131184
// 15141295

import java.util.Scanner;
public class StarPattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        int p;
        int k = 1;
        for(int i=1; i<=row; i++){
            p = k;
            for(int j=1; j<=i; j++){
                System.out.print(p);
                p = p - (row-i+j);
            }
            System.out.println();
            k = k + 1 + row - i;
        }
        sc.close();
    }
}