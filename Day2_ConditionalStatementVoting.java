package src;

import java.util.Scanner;

public class Day2_ConditionalStatementVoting {
    public static void main(String[] args) {
        //Conditional Statement
        //if, else, else if
        //Voting system with user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender 'M' or 'F' : ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter age : ");
        byte age = sc.nextByte();

        if(gender == 'M') {
            if (age >= 21) {
                System.out.println("He can vote");
            } else {
                System.out.println("He cannot vote");
            }
        }
        else if(gender == 'F') {
            if (age >= 18) {
                System.out.println("She can vote");
            } else {
                System.out.println("She cannot vote");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
