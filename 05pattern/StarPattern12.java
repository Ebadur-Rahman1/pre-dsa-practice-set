// ******* 
//  ***** 
//   *** 
//    * 

import java.util.Scanner;

public class StarPattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows*2)-1; j++){
                if(j>=i && j<=(rows*2)-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}