package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * DrunkWalker stuff.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class DrunkWalker {

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

        int steps = readValidInt("Enter a maximum number of steps: ", scan);
        int bound = readValidInt("Enter a boundary size: ", scan);
        int simulations = readValidInt("Enter a number of simulations: ", scan);
        
        scan.close();
        
        int fallen = 0;
        
        for (int i = 0; i < simulations; i++) {            
            RandomWalker drunk = new RandomWalker(steps, bound);
            drunk.walk();
            if (!drunk.inBounds()) {
                fallen++;
            }
        }

        System.out.println(
            fallen 
            + "/" 
            + simulations 
            + " drunk walkers have fallen."
        );
    }
}
