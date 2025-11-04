//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *

import java.util.Scanner;
public class StarPattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int n;
        n = (rows+1)/2;

        int k=0;
        for(int i=1; i<=rows; i++){
            if(rows%2==0){
                if(i<=n) k++;
                if(i>n+1) k--;
            }
            else{
                if(i<=n)
                    k++;
                else
                    k--;
            }
                
            for(int j=1; j<=rows; j++){
                if(j>=n+1-k && j<=n-1+k){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}