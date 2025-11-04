//         A
//       C B
//     F E D
//   J I H G
// O N M L K

public class StarPattern29 {
    public static void main(String[] args) {
        char k = 64;
        for(int i=1; i<=5; i++){
            k = (char)(k + 2 * (i - 1) + 1);
            for(int j=1; j<=5; j++){
                if(j>=6-i){
                    System.out.print(k--);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}