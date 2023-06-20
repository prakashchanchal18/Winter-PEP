package src;

import java.util.Scanner;

public class Day7_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print factorial : ");
        int x = sc.nextInt();
        int f = 0;
        for(int i =1; i <= x; i++) {
            f = i * i + 1;
        }
        System.out.println(f);

    }
}
