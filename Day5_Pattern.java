package src;

import java.util.Scanner;

public class Day5_Pattern {
    public static void main(String[] args) {
        // PATTERN PRINTING

        // Q:- You are given with a value of n, you are supposed to print a right-angled triangle based on the value of n.
        // n = 1
        // *

        // n = 2
        // *
        // * *

        // n = 3
        // *
        // * *
        // * * *

        // n = 4
        //     r r r r
        // col *                    // row = 0, col = 0
        // col * *                  // row = 1, col = 0 1
        // col * * *                // row = 2, col = 0 1 2
        // col * * * *              // row = 3,


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Square
        // n = 3
        //   0 1 2
        // 0 * * *
        // 1 * * *
        // 2 * * *

        // row -> 0 - 2
        // row = 0
        // row = 1
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {          // col -> 0 - 2
                System.out.print("* ");                 // col -> 00, 01, 02
            }                                           // col -> 10, 11, 12
            System.out.println();
        }

        for(int row = 0; row < n; row++) {
            for(int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Print pattern as per the input
        //for example you are given inputs 5 4 1 3 3 so that you print "*" as follows
        //  * * * * *
        //  * *   * *
        //  * *   * *
        //  * *
        //  *
        for(int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
    