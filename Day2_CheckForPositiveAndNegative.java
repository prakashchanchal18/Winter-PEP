package src;
//You are given with a user input
import java.util.Scanner;
public class Day2_CheckForPositiveAndNegative {
    public static void main(String[] args) {
        int number = 10;

        if(number > 0) {
            System.out.println("Number is greater than 0");
        }
        else if(number < 0) {
            System.out.println("Number is less than 0");
        }
        else {
            System.out.println("It is a 0 number");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input_number = sc.nextInt();

        if(input_number > 0) {
            System.out.println("Number is greater than 0");
        }
        else if(input_number < 0) {
            System.out.println("Number is less than 0");
        }
        else {
            System.out.println("It is a 0 number");
        }
    }
}
