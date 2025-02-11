package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;

/**
 * Cone.
 * @author Braeden Sowinski
 * @version 1.0.0
 * 
 * @param r radius
 * @param h height
 */
public record Cone(int r, int h) {
    
    /**
     * volume returns the calculated volume.
     * @return double volume
     */
    public double volume() {
        DecimalFormat format = new DecimalFormat("#.###");
        
        final double magic = 3;
        double v = (Math.PI * (r * r) * h) / magic;
       
        return Double.parseDouble(format.format(v));
    }
    
    /**
     * slantHeight returns the calculated slant height.
     * @return double slantHeight
     */
    public double slantHeight() {
        DecimalFormat format = new DecimalFormat("#.###");
        
        double v = Math.sqrt((r * r) + (h * h));
        
        return Double.parseDouble(format.format(v));
    }
    
    /**
     * surfaceArea returns the calculated surface area.
     * @return double surfaceArea
     */
    public double surfaceArea() {
        DecimalFormat format = new DecimalFormat("#.###");
        
        double v = Math.PI * (r * r) 
                 + Math.PI * r * Math.sqrt((r * r) + (h * h));

        return Double.parseDouble(format.format(v));
    }
    
    /**
     * toString returns cone data as a string.
     * @return string data
     */
    public String toString() {
        return r + " " + h;
    }
}
