package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/** 
 * Names test Name class.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Names {

    /**
     * main program entry.
     * @param args cli input unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = scan.next();
        System.out.print("Enter middle name: ");
        String mid = scan.next();
        System.out.print("Enter last name: ");
        String last = scan.next();
        scan.close();
        
        Name myName = new Name(first, mid, last);
        
        System.out.println(myName.toString());
    }
}
