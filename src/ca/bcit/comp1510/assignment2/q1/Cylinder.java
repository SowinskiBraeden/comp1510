package ca.bcit.comp1510.assignment2.q1;

/**
 * Cylinder data class.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Cylinder {

    /** radius double. **/
    private double radius;
    
    /** height double. **/
    private double height;
    
    /** 
     * Cylinder constructor. 
     * @param r double radius
     * @param h double height
     * */
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    /**
     * getRaidus.
     * @return double radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * getHeight.
     * @return double height
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * setRadius.
     * @param r double new radius
     */
    public void setRadius(double r) {
        radius = r;
    }
    
    /**
     * setHeight.
     * @param h double new height
     */
    public void setHeight(double h) {
        height = h;
    }
    
    /**
     * volume.
     * @return double cylinder volume
     */
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    
    /**
     * surfaceArea.
     * @return double cylinder surface area
     */
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    /**
     * toString.
     * @return string representation of cylinder
     */
    public String toString() {
        return "Radius: " + radius + "\nHeight: " + height;
    }
}
