import java.util.Scanner;

public class Largest_among_three {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        int num2 = a.nextInt();
        int num3 = a.nextInt();
        if (num1 > num2 && num1 > num3) {
                System.out.println("greater number among other is" + num1);
            }
        else if (num2 > num1 && num2 > num3) {
                    System.out.println("greater among three num is " + num2);
                }
             else {
                System.out.println("greater among three num is " + num3);
            }
        }
    }

//when we club the code using if,else if ,else here eveything consider ass single family if first
// condition satisfies then it wont be enter into other condition