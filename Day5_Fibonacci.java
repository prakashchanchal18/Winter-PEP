package src;

//Fibonacci series --> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ......
//Logic --> 0 , 1 , 0+1=1 , 1+1=2 , 1+2=3 , 2+3=5 , 3+5=8 , ....so on
public class Day5_Fibonacci {
    public static void main(String[] args) {
        for(int i = 1; i <= 8; i++) {
            int x = i + (i-1);
            System.out.print(x + ",");
        }
    }
}
