package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {
    Complex c1 = new Complex(3, 4);
    Complex c2 = new Complex(0, 1);
    Complex c3 = new Complex(1, 1);
    
    @Test
    void testPolarComplex() {
        
    }

    @Test
    void testAbs() {
        assertEquals(5, c1.abs());
        assertNotEquals(1, c1.abs());
        assertEquals(1, c2.abs());
        assertNotEquals(5, c2.abs());
    }

    @Test
    void testArg() {
        assertEquals(0.7853981633974483, c3.arg());
        assertNotEquals(0.03532358293, c3.arg());
    }

    @Test
    void testConjugate() {
        assertEquals(new Complex(3, -4), c1.conjugate());
        assertNotEquals(new Complex(3, 4), c1.conjugate());
    }

    @Test
    void testAddComplex() {
        assertEquals(new Complex(4, 5), c1.add(c3));
        assertNotEquals(new Complex(1, 3), c1.add(c3));
    }

    @Test
    void testAddDouble() {
        assertEquals(new Complex(8, 4), c1.add( 5.0));
        assertNotEquals(new Complex(3, 6), c2.add(4.0));
    }

    @Test
    void testSubtractComplex() {
        assertEquals(new Complex(2, 3), c1.subtract(c3));
        assertNotEquals(new Complex(4, 3), c1.subtract(c2));
    }

    @Test
    void testSubtractDouble() {
        assertEquals(new Complex(2, 4), c1.subtract(1.0));
        assertNotEquals(new Complex(4, 3), c1.subtract(3.0));
    }

    @Test
    void testMultiplyComplex() {
        assertEquals(new Complex(-1, 7), c1.multiply(c3));
        assertNotEquals(new Complex(4, 3), c1.multiply(c3));
    }

    @Test
    void testMultiplyDouble() {
        assertEquals(new Complex(6, 8), c1.multiply(2.0));
        assertNotEquals(new Complex(5, 6), c2.multiply(3));
    }

    @Test
    void testReciprocal() {
        assertEquals(new Complex(3.0/25, -4.0/25), c1.reciprocal());
        assertNotEquals(new Complex(3.0/25, -4.0/25), c2.reciprocal());
    }

    @Test
    void testDivideComplex() {
        assertEquals(new Complex(3.5, 0.5), c1.divide(c3));
        assertNotEquals(new Complex(-0.5, 3.5), c1.divide(c3));
    }

    @Test
    void testDivideDouble() {
        assertEquals(new Complex(1.5, 4), c1.divide(2.0));
        assertNotEquals(new Complex(2, 4), c1.divide(1.0));
    }

    @Test
    void testSqrt() {
        assertEquals(new Complex(2, 1), c1.sqrt());
        assertNotEquals(new Complex(1, 2), c1.sqrt());
    }

    @Test
    void testExp() {
        assertEquals(new Complex(-13.128783081462158, -15.200784463067954), c1.exp());
        assertNotEquals(new Complex(1, 2), c1.exp());
    }

    @Test
    void testLog() {
        assertEquals(new Complex(1.6094379124341003, 0.9272952180016122), c1.log());
        assertNotEquals(new Complex(1, 2), c1.log());
    }

    @Test
    void testToString() {
        assertEquals("3.0 + 4.0i", c1.toString());
        assertNotEquals("3 + 4i", c1.toString());
    }
}