package dev.sowinski.comp1510.lab4;

/** 
 * Names test Name class.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Names {

    /**
     * main program entry.
     * @param args cli input unused
     */
    public static void main(String[] args) {
        Name myName = new Name("Braeden", "M", "Sowinski");
        
        System.out.println(myName.toString());
    }
}
