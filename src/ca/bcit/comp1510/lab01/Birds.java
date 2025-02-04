package ca.bcit.comp1510.lab01;

/**
 * Birds demos concatonation.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Birds {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        // defining these as constants due to checkstyle :(
        final int ten = 10;
        final int three = 3;
        System.out.println("Ten robins plus " 
                + (ten + three)
                + " canaries is 23 birds."
        );
    }
}
