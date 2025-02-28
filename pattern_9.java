package patterns;
import java.util.Scanner;
public class pattern_9 {
    public static void main(String[] args){
        Scanner input_1 = new Scanner(System.in);
        int n = input_1.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
