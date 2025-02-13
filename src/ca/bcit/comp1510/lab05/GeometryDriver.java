package ca.bcit.comp1510.lab05;

import java.util.Scanner;

/**
 * GeometryDriver drives geo.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class GeometryDriver {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a radius: ");
        int r = scan.nextInt();
        System.out.print("Enter x coord: ");
        int x = scan.nextInt();
        System.out.print("Enter y coord: ");
        int y = scan.nextInt();
        System.out.print("Enter z coord: ");
        int z = scan.nextInt();

        Sphere sphere = new Sphere(x, y, z, r);
        System.out.println("Created Sphere at    " + sphere.toString() + "\n"
                         + "Sphere Surface Area: " + sphere.surfaceArea() + "\n"
                         + "Sphere Volume:       " + sphere.volume() + "\n"
        );
        
        System.out.print("Enter side length: ");
        int l = scan.nextInt();
        System.out.print("Enter x coord: ");
        x = scan.nextInt();
        System.out.print("Enter y coord: ");
        y = scan.nextInt();
        System.out.print("Enter z coord: ");
        z = scan.nextInt();
        
        Cube cube = new Cube(x, y, z, l);
        System.out.println("Created Cube at      " + cube.toString() + "\n"
                         + "Cube Volume:         " + cube.volume() + "\n"
                         + "Cube Surface Area:   " + cube.surfaceArea() + "\n"
                         + "Cube Face Diagonal:  " + cube.faceDiagonal() + "\n"
                         + "Cube Space Diagonal: " + cube.spaceDiagonal() + "\n"
        );
        
        System.out.print("Enter a height: ");
        int h = scan.nextInt();
        System.out.print("Enter a radius: ");
        r = scan.nextInt();
        
        Cone cone = new Cone(r, h);
        System.out.println("Created Cone at    " + cone.toString() + "\n"
                         + "Cone Volume:       " + cone.volume() + "\n"
                         + "Cone Slant Height: " + cone.slantHeight() + "\n"
                         + "Cone Surface Area: " + cone.surfaceArea());
        
        scan.close();
    }
}
