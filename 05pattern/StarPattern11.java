// * 
// ** 
// *** 
// **** 
// *** 
// **
// * 

import java.util.Scanner;
public class StarPattern11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int k=0;

        for(int i=1; i<=rows; i++){
            if(rows%2==0){
                if(i<=rows/2){
                    k++;
                }
                if(i>rows/2+1){
                    k--;
                }
            }else{
                if(i<=(rows+1)/2){
                    k++;
                }else{
                    k--;
                }
            }

            for(int j=1; j<=(rows+1)/2; j++){
                
                if(j<=k){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}