/* Write a program to check whwther a triangle can be formed with the given values for the angles.
* input: 45 45 45/
* expected output: Triangle cannot be formed
* explanation: We atre getting 3 inputs, that is three angles of triangle , but here the sum of three angles that is 45+45+45
* is not equal to 180 so Triangle cannot be formed is the output.
* Steps: get three input from the users
* step 2 : add those values and store in a variable
* step 3: condition 180 when I sum that values true
* step 4: output.
 */

import java.util.Scanner;
public class problem2_triangle {
    public static void main(String[] args){
        System.out.println("Enter three numbers : ");
        Scanner triangle = new Scanner(System.in);
        int num1 = triangle.nextInt();
        int num2 = triangle.nextInt();
        int num3 = triangle.nextInt();
        int sum = num1 + num2 + num3;
        if(sum == 180 ){
            System.out.println("It can form a triangle");
        }
        else{
            System.out.println("It cannot form a triangle.");
        }
    }

}
