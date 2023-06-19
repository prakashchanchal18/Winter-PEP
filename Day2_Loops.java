package src;

import java.util.Scanner;
public class Day2_Loops {
    public static void main(String[] args) {
        //Loops in java --> for, while, do-while

        // 1. for loop -
        // Q :- what is the purest form of a for loop ===> for(;;)
        // for(declaration + initialization(start); condition(meet for the end); inc/dec)

        // print real nos from 1 to 51
        for(int i = 1; i <= 10; i+=1) {
            System.out.print(i + ", ");
        }
        System.out.println();


        // 2. while Loop -
        // Q - Keep expecting the input from the user, until the user hits 0
                Scanner sc = new Scanner(System.in);
                while(true) {
                    int n = sc.nextInt();
                    if( n == 0) {
                        break;  // stop the loop
                    } else {
                        continue;   // continue with the loop
                    }
                }


        // 3. do-while() -> Exit Controlled Loop
                int counter = 0;
                do {
                    // OPERATIONS
                    System.out.println("It works!");
                } while(counter > 0);

    }
}