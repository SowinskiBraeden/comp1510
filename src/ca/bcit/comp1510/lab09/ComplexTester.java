package ca.bcit.comp1510.lab09;

/**
 * Driver to exercise the use of multiple Complex objects. Includes tests for
 * divide by zero cases
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class ComplexTester {

    /** 3 + 4 I real part. */
    private static final int TEST1R = 3;

    /** 3 + 4 I imaginary part. */
    private static final int TEST1I = 4;

    /** 1 + I real part. */
    private static final int TEST2R = 1;

    /** 1 + I imaginary part. */
    private static final int TEST2I = 1;

    /**
     * Creates some complex number objects and performs various operations on
     * them.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        Complex z1 = new Complex(TEST1R, TEST1I);
        Complex z2 = new Complex(TEST2R, TEST2I);
        Complex z3;
        Complex z4;
        Complex z5;
        Complex z6;
        Complex z7;
        System.out.println("First complex number: " + z1);
        System.out.println("Second complex number: " + z2);

        if (z1.equals(z2)) {
            System.out.println("z1 and z2 are equal.");
        } else {
            System.out.println("z1 and z2 are NOT equal.");
        }

        z3 = z1.reciprocal();
        System.out.println("The reciprocal of z1 is: " + z3);

        z4 = z1.add(z2);
        z5 = z1.subtract(z2);
        z6 = z1.multiply(z2);
        z7 = z1.divide(z2);

        System.out.println("z1 + z2: " + z4);
        System.out.println("z1 - z2: " + z5);
        System.out.println("z1 * z2: " + z6);
        System.out.println("z1 / z2: " + z7);
        System.out.println("One = " + Complex.ONE + "\nZero = " 
               + Complex.ZERO + "\nI = " + Complex.I 
               + "\nI * I = " + Complex.I.multiply(Complex.I));
        
        testFunctions(z1, z2);

        testErrorCases();

    }


    // Groups together error test cases.
    private static void testErrorCases() {
        try {
            Complex.ZERO.reciprocal();
            System.out.println("ZERO reciprocal test failed");
        } catch (IllegalArgumentException ex) {
            System.out.println("ZERO reciprocal test worked");
        }
        try {
            Complex.ONE.divide(Complex.ZERO);
            System.out.println("Divide by zero test failed");
        } catch (IllegalArgumentException ex) {
            System.out.println("Divide by zero test worked");
        }
    }
    
    // Test other Complex functions.
    private static void testFunctions(Complex z1, Complex z2) {
        final double piDiv4 = Math.PI / 4.0;
        final Complex minusOne = Complex.ZERO.subtract(Complex.ONE);
        final Complex pi = new Complex(0.0, Math.PI);
        System.out.println("abs(" + z1 + ") = " + z1.abs()
               + "\nabs(" + Complex.I + ") = " + Complex.I.abs()
               + "\narg(" + z2 + ") = " + z2.arg() 
               + "\npi / 4 = " + piDiv4
               + "\narg(" + Complex.I + ") = " + Complex.I.arg() 
               + "\npi / 2 = " + Math.PI / 2.0
               + "\narg(" + minusOne + ") = " + minusOne.arg() 
               + "\npi / 2 = " + Math.PI
               + "\nconjugate(" + z1 + ") = " + z1.conjugate()
               + "\nexp(" + z1 + ") = " + z1.exp()
               + "\nlog(" + z1 + ") = " + z1.log()
               + "\nexp(log(" + z1 + ")) = " + z1.log().exp()
               + "\nlog(exp(" + z1 + ")) = " + z1.exp().log()
               + "\nexp(" + z2 + ") = " + z2.exp()
               + "\nlog(" + z2 + ") = " + z2.log()
               + "\nexp(log(" + z2 + ")) = " + z2.log().exp()
               + "\nlog(exp(" + z2 + ")) = " + z2.exp().log()
               + "\nexp(πi) + 1 = " + pi.exp().add(Complex.ONE)

        );
    }
}
