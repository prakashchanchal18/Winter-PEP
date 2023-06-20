package src;

import java.util.Scanner;
public class Day8_PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n to calculate power of 2 : ");
        int n = sc.nextInt();
        int i;
        for(i = 2; i <= n; i+= 2);
        {
            int power = 2 * i;
            System.out.println("Value of 2 raise to power " + n + " is : " + power);

        }
    }
}
