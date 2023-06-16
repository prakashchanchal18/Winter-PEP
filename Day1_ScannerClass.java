package src;

import java.util.Scanner;

public class Day1_ScannerClass {
    public static void main(String[] args) {
        // create the object of the Scanner class
        // SYNTAX -> ClassName objectName = new ClassName();
        Scanner sc = new Scanner(System.in);
        // Those object comes preloaded with pre-defined functions(methods) .

        //Integer in Scanner Class
        System.out.print("Enter an Integer value : ");
        int x = sc.nextInt();

        //Float in Scanner Class
        System.out.print("Enter a Float value : ");
        float y = sc.nextFloat();

        //Character in Scanner Class
        System.out.print("Enter a Character value : ");
        String str = sc.next();

        //Boolean in Scanner Class
        System.out.print("Enter a Boolean value : ");
        boolean bool = sc.nextBoolean();
    }
}
