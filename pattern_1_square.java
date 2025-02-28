/*basic pattern probl;ems with equal rows and colums
input= 5;
print *****
      *****
      *****
      *****
      *****

 */

package patterns;
import java.util.Scanner;
public class pattern_1_square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}