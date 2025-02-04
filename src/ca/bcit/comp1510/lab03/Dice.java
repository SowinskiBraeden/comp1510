package ca.bcit.comp1510.lab03;

/**
 * Dice simulate dice rolling.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Dice {
    /**
     * main program entry point.
     * @param args unused
     */
    public static void main(String[] args) {
        final int die4 = 4;
        final int die6 = 6;
        final int die8 = 8;
        final int die10 = 10;
        final int die12 = 12;
        final int die20 = 20;
        
        // to get a random number you do:
        // (Math.random() * (max - min)) + min;
        // this will give a range of min to (max - 1)
        int castDie4 = (int) (Math.random() * die4) + 1;
        int castDie6 = (int) (Math.random() * die6) + 1;
        int castDie8 = (int) (Math.random() * die8) + 1;
        int castDie10 = (int) (Math.random() * die10) + 1;
        int castDie12 = (int) (Math.random() * die12) + 1;
        int castDie20 = (int) (Math.random() * die20) + 1;

        int sum = castDie4 
                + castDie6 
                + castDie8 
                + castDie10 
                + castDie12 
                + castDie20;
        
        System.out.printf("4 sided die:  %d\n", castDie4);
        System.out.printf("6 sided die:  %d\n", castDie6);
        System.out.printf("8 sided die:  %d\n", castDie8);
        System.out.printf("10 sided die: %d\n", castDie10);
        System.out.printf("12 sided die: %d\n", castDie12);
        System.out.printf("20 sided die: %d\n", castDie20);
        System.out.printf("Sum of all dice: %d\n", sum);
    }
}
