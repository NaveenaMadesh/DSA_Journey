import java.util.Scanner;
public class Voting_eligibility {
    public static void main(String[] args){
    System.out.println("Enter your age:");
    Scanner a = new Scanner(System.in);
    int age = a.nextInt( );
    if(age >= 18){
        System.out.println("Your are eligible for voting.");
    }
    else{
        System.out.println("Sry,you are not eligible for voting.");
    }
    }
}
