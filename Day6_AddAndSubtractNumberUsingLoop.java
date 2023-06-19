package src;

import java.util.Scanner;

public class Day6_AddAndSubtractNumberUsingLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number x = : ");
        int x = sc.nextInt();

        System.out.print("Enter a number y = : ");
        int y = sc.nextInt();

        System.out.println("                   -------");

        while (x > 0) {
            int remainder1 = x % 10;
            x = x / 10;
            System.out.print(remainder1);
        }

        while (y > 0) {
            int remainder2 = y % 10;
            y = y / 10;
            System.out.print(remainder2);
        }
    }
}
