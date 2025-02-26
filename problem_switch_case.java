/* Write a program using switch case which takes a value and prints the respective size.
if size is 30 then its small
if size is 38 then its Large
if size is 42 then its XLarge
if size is not any of the above then Invalid.

Input: 29
Expected output:
small
 */

import java.util.Scanner;

public class problem_switch_case {
    public static void main(String[] args){
        System.out.println("Enter a size:");
        Scanner size = new Scanner(System.in);
        int value = size.nextInt();
        switch(value){
            case 30:
                System.out.println("It's small");
                break;
            case 38:
                System.out.println("It's Large");
                break;
            case 42:
                System.out.println("It's XLarge");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
