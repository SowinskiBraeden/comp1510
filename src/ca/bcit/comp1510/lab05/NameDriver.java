package ca.bcit.comp1510.lab05;

/**
 * NameDriver tests Name record.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class NameDriver {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Name name = new Name("Braeden", "M", "Sowinski");

        final int idx4 = 4;
        System.out.println("Full name:          " + name.toString());
        System.out.println("Length:             " + name.length());
        System.out.println("Initials:           " + name.initials());
        System.out.println("4th character:      " + name.charAt(idx4));
        System.out.println("Name format:        " + name.toStringFormat());
        System.out.println("'John' == first:    " + name.equalsFirst("john"));
        System.out.println("'Braeden' == first: " 
                         + name.equalsFirst("Braeden"));
    }    
}
