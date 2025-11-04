//    A 
//   ABA 
//  ABCBA 
// ABCDCBA

public class StarPattern19 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            char ch = 'A';
            for(int j=1; j<=7; j++){
                
                if(j>=5-i && j<=3+i){
                    
                    System.out.print(ch);
                    if(j<=3)
                        ch++;
                    else
                        ch--;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}