package src;

//5. Modify the above program (called RunningNumberProduct) to compute the product of all the numbers from 1 to 10.
// (Hint: Use a variable called product instead of sum and initialize product to 1. Modify the sum = sum + number
// statement to do the multiplication on variable product.
public class Day4_RunningNumberProduct {
    public static void main(String[] args) {
        int product = 1;
        for(int i = 1; i <= 10; i++) {
            product = product * i;
        }
        System.out.println("Product is : " + product);
    }
}
