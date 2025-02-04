package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/** 
 * Paint.
 * 
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Paint {

    /** main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        // square feet covered per can of paint
        final int coverage = 400;

        Scanner scan = new Scanner(System.in);

        double width;
        double length;
        double height;
        double layers;
        
        System.out.print("Please enter room width  (ft.): ");
        width = scan.nextDouble();
        
        System.out.print("Please enter room length (ft.): ");
        length = scan.nextDouble();
        
        System.out.print("Please enter room height (ft.): ");
        height = scan.nextDouble();
        
        System.out.print("Please enter number of layers: ");
        layers = scan.nextDouble();

        scan.close();
        
        double surfaceArea = (width * height * 2)
                + (length * height * 2) + (width * length);

        double coverageNeeded = surfaceArea * layers;
        int cansOfPaint = (int) Math.ceil(coverageNeeded / coverage);
        
        System.out.println("You need " + cansOfPaint + " cans of paint.");
    }
}
