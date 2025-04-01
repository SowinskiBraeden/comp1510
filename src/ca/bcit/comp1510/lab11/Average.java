package ca.bcit.comp1510.lab11;

import java.lang.NumberFormatException;

/**
 * Average with command line args.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Average {

    /**
     * main program entry.
     * @param args from command line.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments.");
            return;
        }

        double total = 0.0;
        int numbers = 0;
        
        for (int i = 0; i < args.length; i++) {
            try {                
                total += Double.parseDouble(args[i]);
                numbers++;
            } catch (NumberFormatException e) {
                continue;
            }
        }
        
        System.out.println("Average: " + total / numbers);
    }
}
