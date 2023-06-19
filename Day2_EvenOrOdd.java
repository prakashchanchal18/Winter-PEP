package src;

import java.util.Scanner;
public class Day2_EvenOrOdd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        // for any even no, division by 2, yields remainder 0
        // any number when divided by 2 yielding remainder 0, is an even number

        // int output = input_number / 2;          // Division Operator (/) - Quotient
        if(x % 2 == 0) {                          // Modulus Operator (%) - Remainder
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
