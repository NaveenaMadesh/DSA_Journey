/*Write a Program which takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4
/
Expected output:

****

***

**

*
 */
package patterns;

import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
