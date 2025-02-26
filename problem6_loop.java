/*write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
Input Nandy
Raja
5
output
NandyRaja  for 5 times
 */

import java.util.Scanner;

public class problem6_loop {
    public static void main(String[] args){
        //System.out.println("Enter :");
        Scanner loop = new Scanner(System.in);
        System.out.println("Enter your firstname :");
        String firstName = loop.next();
        System.out.println("Enter your lastname:");
        String lastName = loop.next();
        System.out.println("Enter a number :");
        int num = loop.nextInt();
        int i = 1;
        while(i<=num){
            System.out.println(firstName+lastName);
            i++;
        }


    }
}
