//     1
//    12
//   123
//  1234
// 12345
//  1234
//   123
//    12
//     1

public class StarPattern15 {
    public static void main(String[] args){
        int k=0;
        int x;
        for(int i=1; i<=9; i++){
            x = 1;
            if(i<6)
                k++;
            else
                k--;
            for(int j=1; j<=5; j++){
                if(j>=6-k){
                    System.out.print(x++);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}