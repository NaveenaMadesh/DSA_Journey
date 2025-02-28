package patterns;

import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for(int k =1; k<=N;k++){
            for(int l = 1;l<=N-k;l++){
                System.out.print(l);
            }
            System.out.println("");
        }
    }
}

