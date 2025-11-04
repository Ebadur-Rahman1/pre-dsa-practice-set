//    A1 
//   AB12
//  ABC123
// ABCD1234

public class StarPattern20 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            char ch = 'A';
                int n = 1;
            for(int j=1; j<=8; j++){
                
                if(j>=5-i && j<=4+i){
                    if(j<=4){
                        System.out.print(ch++);
                    }else {
                        System.out.print(n++);
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}