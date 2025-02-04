package ca.bcit.comp1510.lab02;

/*
 * int x;     -> initialized empty variable
 * int x = 3; -> initialized variable and assigned value 3;
 * x = 3;     -> assigned value 3 to variable x
 */

/**
 * Prelab answers to questions.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Prelab {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        final int a = 3;
        final int b = 9;
        final int c = 7;
        final double w = 12.9;
        final double y = 3.2;
        
        // b * c first then add a
        System.out.println(a + b * c);
        
        // left to right
        System.out.println(a - b - c);

        // left to right
        System.out.println(a / b);
        
        // left to right
        System.out.println(b / a);
        
        // b / c then subtract from a
        System.out.println(a - b / c);

        // left to right
        System.out.println(w / y);
        
        // left to right
        System.out.println(y / w);
        
        // w / b then subtract from a
        System.out.println(a + w / b);
        
        // left to right
        System.out.println(a % b / y);
        
        // left to right
        System.out.println(b % a);
        
        // left to right
        System.out.println(w % y);
    }
}
