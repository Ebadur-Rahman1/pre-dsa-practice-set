// 1
// 3 * 2 
// 4 * 5 * 6
// 10 * 9 * 8 * 7
// 11 * 12 * 13 * 14 * 15

public class StarPattern28 {
    public static void main(String[] args) {
        int num = 1;  // keeps track of sequence
        for (int i = 1; i <= 5; i++) {
            int temp = num;  // store starting number of current row

            // calculate next starting number for next iteration
            num = num + i;

            if (i % 2 == 0) {
                // even row → print in reverse order
                temp = num - 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(temp--);
                    if (j < i) System.out.print(" * ");
                }
            } else {
                // odd row → print in normal order
                temp = num - i;
                for (int j = 1; j <= i; j++) {
                    System.out.print(temp++);
                    if (j < i) System.out.print(" * ");
                }
            }

            System.out.println();
        }
    }
}