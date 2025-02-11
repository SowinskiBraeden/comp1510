package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;

/**
 * Sphere record.
 * @author Braeden Sowinski
 * @version 1.0.0
 * 
 * @param x coord.
 * @param y coord.
 * @param z coord.
 * @param r radius.
 */
public record Sphere(int x, int y, int z, int r) {

    /** 
     * surfaceArea calculates the surface area
     * of the given sphere.
     * @return double
     */
    public double surfaceArea() {
        DecimalFormat format = new DecimalFormat("#.###");
        
        final int magic = 4;
        double a = magic * Math.PI * (r * r);
        
        return Double.parseDouble(format.format(a));
    }
    
    /**
     * volume calculates the volume of the
     * given sphere.
     * @return double
     */
    public double volume() {
        DecimalFormat format = new DecimalFormat("#.###");
        
        final double magic = 0.75;
        final int power = 3;
        double v = magic * Math.PI * Math.pow(r, power);

        return Double.parseDouble(format.format(v));
    }
    
    /**
     * toString returns the sphere data as
     * a string.
     * @return string
     */
    public String toString() {
        return x + " "
             + y + " "
             + z + " "
             + r;
    }
}
