// 1
// 10
// 101
// 1010
// 10101
// 101010
// can also be use extra variable n and then in if condition n = 1-n; after each print

public class StarPattern23 {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                if(j<=i){
                    if(j%2==0)
                        System.out.print("0");
                    else 
                        System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}