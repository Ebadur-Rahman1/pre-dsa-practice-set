// 0 
// 0 1 
// 0 2 4 
// 0 3 6 9 
// 0 4 8 12 16

public class StarPattern36 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            int k = 0;
            for(int j=1; j<=i; j++){
                System.out.print(k + " ");
                k = k + i - 1;
            }
            System.out.println();
        }
    }
}