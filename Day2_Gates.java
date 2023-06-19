package src;

public class Day2_Gates {
    public static void main(String[] args) {
        // Logical Gates --> AND, OR, NOT

        // AND Gate ->
        // i/p A    i/p B   o/p
        // F        F       F
        // F        T       F
        // T        F       F
        // T        T       T
       if( (10 > 100) && (20 < 100) ) {
            System.out.println("true");
       } else {
            System.out.println("false");
        }

        // OR Gate ->
        // i/p A    i/p B   o/p
        // F        F       F
        // F        T       T
        // T        F       T
        // T        T       T
        if( (10 > 100) || (20 < 100) ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // NOT Gate ->
        // i/p A    o/p
        // F         T
        // T         F
        if( !(100 < 1) ) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
