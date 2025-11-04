//      1 
//     A  B 
//   1  2  3
// A  B  C  D

import java.util.Scanner;
public class StarPattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int line = sc.nextInt();
        int n;
        char alpha;

        for(int i=1; i<=line; i++){
            int k = 1;
             n = 1;
             alpha = 'A';
            for(int j=1; j<=2*line-1; j++){
                if(j>=line+1-i && j<=line-1+i){
                    if(k==1){
                        if(i%2==1){
                            System.out.print(n++);
                        }else {
                            System.out.print(alpha++);
                        }
                        
                    } else {
                        System.out.print(" ");
                    }
                    k = 1- k;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}