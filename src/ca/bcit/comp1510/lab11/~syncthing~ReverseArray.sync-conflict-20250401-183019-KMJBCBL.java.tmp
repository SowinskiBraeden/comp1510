package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * ReverseArray is self explanitory.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class ReverseArray {

    /**
     * readValidInt reads and validates an integer.
     * @param msg to print;
     * @param scan to read input
     * @return validated int
     */
    private static int readValidInt(String msg, Scanner scan) {
        int number = 0;
        boolean valid = false;
        
        do {
            System.out.print(msg);
            
            if (!scan.hasNextInt()) {
                System.out.println(scan.next() + " is not a valid number.\n");
                continue;
            }
            
            number = scan.nextInt();
            valid = true;

        } while (!valid);
                
        return number;
    }
    
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int length = readValidInt(
                "Please enter the length for the array: ",
                scan
        );
        
        for (int i = 0; i < length; i++) {
            int num = readValidInt(
                    "Please enter a number: ",
                    scan
            );
            
        }        
    }
}
