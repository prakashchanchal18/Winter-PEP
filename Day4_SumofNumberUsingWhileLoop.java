package src;

public class Day4_SumofNumberUsingWhileLoop {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = lowerbound + 1;
        while(lowerbound < upperbound) {
            sum = lowerbound++;

        }
        System.out.println("Sum is : " + sum);
    }
}
