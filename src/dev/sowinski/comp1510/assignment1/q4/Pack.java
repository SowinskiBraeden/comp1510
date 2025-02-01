package dev.sowinski.comp1510.assignment1.q4;

import java.util.Scanner;

/**
 * Pack encodes 5 MIX-character strings into a
 * single int variable, while also being able to
 * decode an int variable back to the original
 * characters.
 * 
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Pack {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 5 MIX-characters (A-I): ");
        String raw = scan.nextLine();
        scan.close();

        final int idx0 = 0;
        final int idx1 = 1;
        final int idx2 = 2;
        final int idx3 = 3;
        final int idx4 = 4;
        
        char c1 = raw.charAt(idx0);
        char c2 = raw.charAt(idx1);
        char c3 = raw.charAt(idx2);
        char c4 = raw.charAt(idx3);
        char c5 = raw.charAt(idx4);
        
        final int base = 56;
                
        int encoded = (int) (c1 - 'A' + 1) * (int) Math.pow(base, idx4)
                          + (c2 - 'A' + 1) * (int) Math.pow(base, idx3)
                          + (c3 - 'A' + 1) * (int) Math.pow(base, idx2)
                          + (c4 - 'A' + 1) * (int) Math.pow(base, idx1)
                          + (c5 - 'A' + 1) * (int) Math.pow(base, idx0);
        
        System.out.println("Encoded: " + encoded);
        
        char decodeC5 = (char) ((encoded % base) - 1 + 'A');
        encoded /= base;

        char decodeC4 = (char) ((encoded % base) - 1 + 'A');
        encoded /= base;

        char decodeC3 = (char) ((encoded % base) - 1 + 'A');
        encoded /= base;

        char decodeC2 = (char) ((encoded % base) - 1 + 'A');
        encoded /= base;

        char decodeC1 = (char) ((encoded % base) - 1 + 'A');

        System.out.println("Decoded: "
                + decodeC1
                + decodeC2
                + decodeC3
                + decodeC4
                + decodeC5);
    }
}
