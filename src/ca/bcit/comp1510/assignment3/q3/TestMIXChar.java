package ca.bcit.comp1510.assignment3.q3;

import java.util.Scanner;

/**
 * TestMIXChar test MIXChar and Message.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class TestMIXChar {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a message: ");
        String line = scan.nextLine();
                
        scan.close();

        char[] c = line.toCharArray();
        MIXChar[] characters = new MIXChar[c.length];
        
        for (int i = 0; i < c.length; i++) {
            try {
                characters[i] = new MIXChar(c[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(
                    "\"" 
                    + line 
                    + "\" contains an invalid MIX Character"
                );
                return;
            }
        }
        
        Message m = new Message(characters);
        
        System.out.println(m.toLongs());
        System.out.println(m.toString());
    }
}
