package src;

import java.util.Scanner;

//Hello World
public class Day1_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter your First Name : ");
        String str1 = scr.next();

        System.out.print("Enter your Last Name : ");
        String str2 = scr.next();

        System.out.print("Your Name is : " + str1 + " " + str2);
    }
}
