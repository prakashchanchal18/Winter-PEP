package src;

import java.util.Scanner;
public class Day3_GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x > y && x > z) {
            System.out.println( x + " is greater");
        }
        else if(y > x && y > z) {
            System.out.println( y + " is greater");
        }
        else {
            System.out.println(z + " is greater");
        }
    }
}
