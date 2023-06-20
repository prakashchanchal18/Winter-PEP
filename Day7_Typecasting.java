package src;

public class Day7_Typecasting {
    public static void main(String[] args) {
        //Typecasting -- > When you assign a value of one primitive datatype to another datatype.
        //Two Types --->
        // 1. Winding typecasting(Auto)
        //byte --> short --> char --> int --> long --> float --> double
        //2. Narrowing typecasting (Manual)
        //double --> float --> long --> int --> char --> short --> byte

        int a = 9;
        double b = a;
        System.out.println(b);

        double x = 9.78d;
        int y = (int) a;
        System.out.println(y);


    }
}
