package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * Distance calculates distance between two points
 * using pythagorean theorem.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Distance {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double x1;
        double y1;
        double x2;
        double y2;
        
        System.out.print("Enter x1 coord: ");
        x1 = scan.nextDouble();
        System.out.print("Enter y1 coord: ");
        y1 = scan.nextDouble();
        System.out.print("Enter x2 coord: ");
        x2 = scan.nextDouble();
        System.out.print("Enter y2 coord: ");
        y2 = scan.nextDouble();
        
        scan.close();
        
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) 
                + Math.pow((y2 - y1), 2));
        
        
        // Yes this looks neater than a long single line -- checkstyle
        System.out.printf("Distance between" 
                + "(%.2f, %.2f) and (%.2f, %.2f): %.2f", 
                x1, y1, x2, y2, distance);
    }
}
