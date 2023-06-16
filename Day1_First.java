package src;

public class Day1_First {
    //If you want to create a java executable file, you should have a main method.
    /* Multi line comments */
    //Java Packages
    //Java.lang
    //Java primitive data types. --> to store & manage diff types if data
    // roll number, name, percent, scores, isGraduate ...
    // storing the data -> variables
    // Syntax --> dataType variableName = constantValue;
    public static void main(String[] args) {

        // Primitive Data Types -->
        //1. Byte -> -128 to 127
        byte var1 = 124;
        System.out.println(var1);

        //2. Short -> -32,768 to 32767
        short var2 = 23675;
        System.out.println(var2);

        //3. Int -> -2^31 to 2^31–1
        byte var3 = 124;
        System.out.println(var3);

        //4. Long -> -2^63 to 2^63-1
        //extends the range of integer input double to int.
        //You must add a 'L' in the end of the value.
        long var4 = 10020202938382292L;
        System.out.println(var4);

        //5. boolean -> true/false
        boolean isCool = false;
        System.out.println(isCool);

        //6. Char -> '' Always is single quote and stores only one character
        //Can hold special character.
        //Can hold numeric value also.
        //A to Z --> 65 to 91
        //a to z --> 97 to 122
        char ch = 'c';
        System.out.println(ch);

        //7. float -> real.decimal ---> 3.14f
        //Add an f at the end of float value.
        //float only hold values till 7 decimal places.
        float pi = 3.141513f;
        System.out.println(pi);

        //8. double --> real.decimal
        //double extend the limit of decimal values.
        //It can go upto 16 decimal places.
        double pi2 = 3.141513456747478838383;
        System.out.println(pi2);
    }
}
