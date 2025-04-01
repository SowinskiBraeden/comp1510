package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * Shopping cart driver.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Shopping {

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
     * @param args unused.
     */
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        

        final double burgerPrice = 8.16;        
        final double friesPrice = 3.25;
        final double cokePrice = 2.75;
        
        int burgers = 0;
        int fries = 0;
        int cokes = 0;
        
        final int finish = 4;
        int input = 0;

        final String msg = "Select an item to add to cart:\n"
                + "(1). Burger $8.16\n"
                + "(2). Fries  $3.25\n"
                + "(3). Coke   $2.75\n"
                + "(4). Proceed to Checkout\n"
                + "> ";
        
        final int startSize = 3;
        Transaction cart = new Transaction(startSize);

        final int t = 3;
        final int f = 4;
        
        do {
            input = readValidInt(msg, scan);
            
            switch (input) {
                case 1:
                    cart.addToCart("Burger", burgerPrice, 1);
                    break;
                case 2:
                    cart.addToCart("fries", fries, 1);
                    break;
                case t:
                    cart.addToCart(new Item("Coke", cokePrice, 1));
                    break;
                case f:
                    System.out.println("Checking Out...");
                    System.out.println(cart.getCount() + " items comes to " 
                            + cart.getTotalPrice());
                    break;
                default:
                    System.out.println(input + " is not a valid input.");
                    break;
            }
        } while (input != finish);
        
        scan.close();
    }
}
