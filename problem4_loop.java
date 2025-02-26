/*Write a program which takes two values x and y. Prints x for y number of times.
* condition less than or equal to y */

import java.util.Scanner;
public class problem4_loop {
    public static void main(String[] args){
        System.out.println("Enter two values:");
        Scanner loop = new Scanner(System.in);
        int x = loop.nextInt();
        int y = loop.nextInt();
        for(int i=1;i<=y;i++){
            System.out.println(x);
        }

    }
}
