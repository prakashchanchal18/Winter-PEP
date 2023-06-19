package src;//Create a dynamic array, taking size from the user
import java.util.Scanner;
public class Day6_Arrays {
    public static void main(String[] args) {
        //Syntax : datatype[ ] arrayName = new dataType[size];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Build an array of specified size.
        int[] numbers = new int[n];

        //Loop to take input from the user.
        for(int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();

        //Loop to print output of array
        for(int i = 0; i < n; i++)
            System.out.println(numbers[i] + " ");
        System.out.println();
    }
}
