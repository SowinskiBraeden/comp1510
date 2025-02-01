package dev.sowinski.comp1510.assignment1.q1;

import java.util.Scanner;

/**
 * Change calculates bills and coins 
 * required to represent a given dollar
 * amount.
 * 
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Change {

    /** TEN represents ten dollar bill. */
    static final double TEN = 10.00;
    
    /** FIVE represents five dollar bill. */
    static final double FIVE = 5.00;
    
    /** TOONIE represents 2 dollar coin. */
    static final double TOONIE = 2.00;
    
    /** LOONIE represents 1 dollar coin. */
    static final double LOONIE = 1.00;
    
    /** QUARTER represents the quarter coin. */
    static final double QUARTER = 0.25;
    
    /** DIME represents the dime coin. */
    static final double DIME = 0.10;
    
    /** NICKEL represents the nickel coin. */
    static final double NICKEL = 0.05;
    
    /** PENNY represents the penny coin. */
    static final double PENNY = 0.01;
    
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        final double magicNumber = 0.001;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter dollar amount: ");
        double dollars = scan.nextDouble();
        scan.close();

        System.out.println("You will need the following to make $" + dollars);
        
        System.out.println((int) (dollars / TEN) + " $10   dollar bill(s).");
        dollars %= TEN;
        
        System.out.println((int) (dollars / FIVE) + " $5    dollar bill(s).");
        dollars %= FIVE;
        
        System.out.println((int) (dollars / TOONIE) + " $2    toonie(s).");
        dollars %= TOONIE;
        
        System.out.println((int) (dollars / LOONIE) + " $1    loonie(s).");
        dollars %= LOONIE;
        
        System.out.println((int) (dollars / QUARTER) + " $0.25 quarter(s).");
        dollars %= QUARTER;
        dollars += magicNumber;
        
        System.out.println((int) (dollars / DIME) + " $0.1  dime(s).");
        dollars %= DIME;
        
        System.out.println((int) (dollars / NICKEL) + " $0.05 nickel(s).");
        dollars %= NICKEL;
        
        System.out.println((int) (dollars / PENNY) + " $0.01 pennie(s).");   
    }    
}
