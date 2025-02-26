/* Write a program that takes an integer, then a string,
then a char from the user and prints them in the screen.
 step 1: print a statement to get valid input
 step2 : use built-in class to get different variety of input.*/
import java.util.Scanner;
public class problem1_inputs {
    public static void main(String[] args ){
       // System.out.print("Enter a number:");
        Scanner input = new Scanner(System.in);
        int int_input = input.nextInt();
       // System.out.print("Enter a string:");
        String input2 = input.next();//  use nextLine in case of reading entire line
        //System.out.println("Enter a character:");
        char input3 = input.next().charAt(0);//we are extracting only the first letter here as a charcater so we should include charAt(0)
        System.out.println(  int_input + "\n" + input2 + "\n " + input3);
    }




}
