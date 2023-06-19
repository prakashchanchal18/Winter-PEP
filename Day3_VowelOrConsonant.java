package src;

import java.util.Scanner;
public class Day3_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character you want to check :");
        char input_ch = sc.next().charAt(0);

        if(input_ch == 'A' || input_ch == 'E' || input_ch == 'I' || input_ch == 'O' || input_ch == 'U' || input_ch == 'a' || input_ch == 'e' ||input_ch == 'i' || input_ch == 'o' || input_ch == 'u') {
            System.out.println("Given input is vowel.");
        }
        else {
            System.out.println("Given input is consonant.");
        }

        System.out.print("Enter the character you want to check :");
        char myChar = sc.next().charAt(0);
    }
}
