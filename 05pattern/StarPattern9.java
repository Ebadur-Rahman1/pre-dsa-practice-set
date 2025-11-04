//  ABCDCBA  
//  ABC CBA
//  AB   BA
//  A     A

public class StarPattern9 {
    public static void main(String[] args){
        for(int i=1; i<=4; i++){
                char l = 'A';
            for(int j=1; j<=7; j++){
                if(j<=5-i || j>=3+i){
                    System.out.print(l);
                    if(j<4)
                        l++;
                    else
                        l--;
                }
                else{
                    System.out.print(" ");
                    if(j==4) l--;
                }
            }
            System.out.println();
        }
    }    
}