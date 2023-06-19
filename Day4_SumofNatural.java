package src;

import java.util.Scanner;
public class Day4_SumofNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        sum = (n)*(n+1)/2;
        System.out.print("Sum of n Natural number is : " + sum);


    }
}
