package ca.bcit.comp1510.assignment2.q1;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class MultiCylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int r1 = 4;
        final int r2 = 2;
        final int r3 = 6;
        final int r4 = 3;
        final int h1 = 6;
        final int h2 = 5;
        final int h3 = 10;
        final int h4 = 8;

        
        Cylinder c1 = new Cylinder(r1, h1);
        Cylinder c2 = new Cylinder(r2, h2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1.setRadius(r3);
        c1.setHeight(h3);
        c2.setRadius(r4);
        c2.setHeight(h4);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
