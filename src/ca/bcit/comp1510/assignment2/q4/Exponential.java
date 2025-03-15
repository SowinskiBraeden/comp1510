package ca.bcit.comp1510.assignment2.q4;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Exponential {

    /** 
     * exp calculates stuff. 
     * @param x double
     * @return double
     * */
    public static double exp(double x) {        
        double r = 1.0;
        double t = 1.0;
        
        final double m = 1e-10;
        
        for (int k = 1; Math.abs(t) > m; k++) {
            t *= (x / k);
            r += t;
        }
        
        return r;
    }
    
    /**
     * Describe what the main method does here.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        final double min = -10.0;
        final double max = 10.0;
        for (double i = min; i <= max; i++) {
            double x = exp(i);
            System.out.println("x = " + i + " e^x = " + x);
        }
    }
}
