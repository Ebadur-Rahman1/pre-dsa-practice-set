// *        * 
//   *    * 
//     * 
//   *    * 
// *        * 

import java.util.Scanner;
public class StarPattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==i || j==n+1-i){
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
