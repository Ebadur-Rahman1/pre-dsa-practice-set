// A B C D E F G
// A B C   E F G
// A B       F G
// A           G

public class StarPattern33 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            char alpha = 'A';
            for(int j=1; j<=7; j++){
                if(j<=5-i || j>=3+i){
                    System.out.print(alpha++);
                }else{
                    System.out.print(" ");
                    alpha++;
                }
            }
            System.out.println();
        }
    }
}
