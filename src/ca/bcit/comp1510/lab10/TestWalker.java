package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * TestWalker to test RandomWalker.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class TestWalker {
    
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
        
        final int maxSteps = 10;
        final int bound = 5;
        
        RandomWalker walker = new RandomWalker(maxSteps, bound);

        Scanner scan = new Scanner(System.in);
        int numSteps = readValidInt("Enter a maximum number of steps: ", scan);
        int boundary = readValidInt("Enter a boundary size: ", scan);
        scan.close();

        RandomWalker userWalker = new RandomWalker(numSteps, boundary);
        
        System.out.println();
        System.out.println(walker.toString());
        System.out.println(userWalker.toString());
        final int steps = 5;
        for (int i = 0; i < steps; i++) {
            walker.takeStep();
            userWalker.takeStep();
            
            System.out.println(walker.toString());
            System.out.println(walker.getMaximumDistance());
            System.out.println(userWalker.toString());
            System.out.println(userWalker.getMaximumDistance());
        }
        
        System.out.println("\nFar Walker");
        final int bigSteps = 200;
        final int bigBound = 10;
        RandomWalker farWalker = new RandomWalker(bigSteps, bigBound);

        System.out.println(farWalker.toString());
        farWalker.walk();
        System.out.println(farWalker.toString());        
        System.out.println(farWalker.getMaximumDistance());
    }
}
