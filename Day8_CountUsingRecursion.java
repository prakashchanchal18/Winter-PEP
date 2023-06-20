package src;

import java.util.Scanner;

public class Day8_CountUsingRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--)
            System.out.print(i + ", ");
    }
}
