package src;

import java.util.Scanner;
public class Day3_PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number whose table you want print : ");
        byte n = sc.nextByte();

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
