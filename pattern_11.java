package patterns;
import java.util.Scanner;
public class pattern_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++k+" ");
            }
            System.out.println("");
        }
    }
}