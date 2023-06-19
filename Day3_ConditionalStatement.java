package src;

public class Day3_ConditionalStatement {
    public static void main(String[] args) {
        //That when you want to execute a piece of code based on the conditions.
        //Always produce True/False.
        //Three Conditional statement --> (if, else, else if)
        // if(condition) {
        //    // True statements
        //    }
        //    else {
        //    // false Statement
        // }

        //VOTING SYSTEM
        //gender = 'M' / 'F'
        //gender -> 'M', age -> >=21; then he can vote
        //gender -> 'F', age -> >=18; then she can vote

        char gender = 'M';
        byte age = 30;
        if(gender == 'F') {
            if(age >= 18) {
                System.out.println("She can vote");
            }
            else {
                System.out.println("She cannot vote");
            }
        }
        else if(gender == 'M') {
            if(age >= 21) {
                System.out.println("He can vote");
            }
            else {
                System.out.println("He cannot vote");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
