/* Write a program to take x and print multiples of x till 100
* condition <=1000 0<1000
* initialization input 5 5<1000 i
* how to update that? 5 i=i+5 i=i+x i*/

import java.util.Scanner;

public class problem5_loop {
    public static void main(String[] args){
        System.out.println("Enter a value:");
        Scanner loop = new Scanner(System.in);
        int x = loop.nextInt();
        for(int i=x;i<=1000;i=i+x){
            System.out.println(i);
        }

    }
}
