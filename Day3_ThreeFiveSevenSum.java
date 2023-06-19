package src;

//Write a program called ThreeFiveSevenSum to sum all the running integers from 1 to 1000,
// that are divisible by 3,5 or 7, but not by 15,21,35,105.
public class Day3_ThreeFiveSevenSum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 1000; i++) {
            if(i%3 == 0 || i%5 == 0 || i%7 == 0 && i%15 != 0 && i%21 != 0 && i%35 != 0 && i%105 != 0 ) {
                sum = sum + i;
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
