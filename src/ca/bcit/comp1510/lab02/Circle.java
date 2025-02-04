package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Circle does something.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Circle {

    /**
     * main, entry point of the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final double pi = 3.141592654;
        double radius;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a radius: ");
        radius = scan.nextDouble();
        System.out.print("\n");
        scan.close();

        
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        double doubleRadius = 2 * radius;
        double doubleCircumference = 2 * pi * doubleRadius;
        double doubleArea = 2 * doubleRadius * doubleRadius;

        double diffCircumference = doubleCircumference / circumference;
        double diffArea = doubleArea / area;
        
        System.out.println("Circle of radius " + radius + ":");
        System.out.println("Circumference: " + circumference);
        System.out.println("Area:          " + area);
        System.out.println();

        System.out.println("Circle of radius " 
                + doubleRadius 
                + " (2 * " + radius + "):");
        System.out.println("Circumference: " + doubleCircumference);
        System.out.println("Area:          " + doubleArea);
        System.out.println();

        System.out.println("The area of the circle with double the radius is " 
                + diffArea + " times larger");
        System.out.println("The circumference of the double circle is " 
                + diffCircumference + " time larger"); 
    }
}
