//       * 
//     *   * 
//   *   *   * 
// *   *   *   *

import java.util.Scanner;
public class StarPattern35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number rows: ");
        int row = sc.nextInt();
        
        int flag = 1;
        for(int i=1, k=0; i<=2*row-1; i++){
            if(i<row-k){
                System.out.print(" ");
            }else{
                if(flag==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                flag = 1 - flag;
            }
            if(i==row+k){
                k++;
                System.out.println();
                if(i==2*row-1){
                    break;
                }
                i =0;
                flag = 1;
            }
        }

        sc.close();
    }
}