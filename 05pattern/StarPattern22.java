//    1 
//   12A
//  123AB
// 1234ABC

public class StarPattern22 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            int n=1;
            char ch = 'A';
            for(int j=1; j<=7; j++){
                if(j>=5-i && j<=3+i){
                    if(j>=5){
                        System.out.print(ch++);
                    }else{
                        System.out.print(n++);
                    }
                    
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
