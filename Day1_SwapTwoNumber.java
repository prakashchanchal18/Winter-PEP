package src;

import java.util.Scanner;
public class Day1_SwapTwoNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter First Number x = : ");
        int x = scr.nextInt();

        System.out.print("Enter Second Number y = : ");
        int y = scr.nextInt();

        int swap;
        swap = x;
        x = y;
        y = swap;

        System.out.println("Number after swapping becomes : " + "x = " + x + " and " + "y = " + y);

       /* public int swapMethod (int p, int q, int r) {
            r = p;
            p = q;
            q = r;
        }
        System.out.println("Nu");*/
    }
}
