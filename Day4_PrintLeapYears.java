package src;//Write a program called PrintLeapYears to print all the leap years between AD999 to AD2010.
//Also print the total number of leap years.
//(Hint:Use an int variable called count, which is initialized to zero. Increment the count whenever a leap year found.)
import java.util.Scanner;

public class Day4_PrintLeapYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any year : ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
