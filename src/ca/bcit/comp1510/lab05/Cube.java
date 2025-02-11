package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;

/**
 * Cube.
 * @author Braeden Sowinski
 * @version 1.0.0
 * 
 * @param x coord.
 * @param y coord.
 * @param z coord.
 * @param len side length.
 */
public record Cube(int x, int y, int z, int len) {

    /**
     * toString returns cube data as string.
     * @return string
     */
    public String toString() {
        return x + " "
             + y + " "
             + z + " "
             + len;
    }

    /**
     * surfaceArea returns the calculated surface
     * area.
     * @return int surfaceArea
     */
    public int surfaceArea() {
        DecimalFormat format = new DecimalFormat("#.###");

        final int sides = 6;
        int a =  sides * (int) Math.pow(len, 2);

        return Integer.parseInt(format.format(a));
    }

    /** volume returns the calculated volume.
     * @return int volume
     */
    public int volume() {
        DecimalFormat format = new DecimalFormat("#.###");
        
        final int power = 3;
        int v =  (int) Math.pow(len, power);

        return Integer.parseInt(format.format(v));
    }
    
    /**
     * faceDiagonal returns the face calculated 
     * diagonal.
     * @return double faceDiagonal
     */
    public double faceDiagonal() {
        DecimalFormat format = new DecimalFormat("#.###");
        
        double d = Math.sqrt(2) * len;

        return Double.parseDouble(format.format(d));
    }
    
    /**
     * spaceDiagonal returns the calculated
     * space diagonal.
     * @return double spaceDiagonal
     */
    public double spaceDiagonal() {
        DecimalFormat format = new DecimalFormat("#.###");
        
        final int magic = 3;
        double d = Math.sqrt(magic) * len;
        
        return Double.parseDouble(format.format(d));
    }
}
