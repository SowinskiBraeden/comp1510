package ca.bcit.comp1510.lab06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.HashSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * MathematicsTest.
 * 
 * @author BCIT
 * @version 1.0
 */
public class Mathematics2Test {

    /**
     * The Mathematics object to test.
     */
    private Mathematics2 math;

    /**
     * Creates a new Mathematics objects before each test is executed.
     * 
     * @throws Exception
     *             if a Mathematics object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        math = new Mathematics2();
    }

    /**
     * Test method for the value of ONE_FOOT_TO_KILOMETER_RATIO.
     */
    @Test
    public void testFeetToKMRatioValue() {
        assertEquals(0.0003048, Mathematics2.FOOT_TO_KILOMETRE_RATIO, 0.0000001);
    }

    /**
     * Tests getSquareArea method.
     */
    @Test
    public void testGetSquareArea1() {
        double area = math.getSquareArea(2.0);
        assertEquals(4.0, area, 0.1);
    }

    /**
     * Tests getSquareArea method.
     */
    @Test
    public void testGetSquareArea2() {
        double area = math.getSquareArea(32.0);
        assertEquals(1024.0, area, 0.1);
    }

    /**
     * Tests add method.
     */
    @Test
    public void testAdd1() {
        double sum = math.add(6.0, 7.0);
        assertEquals(13.0, sum, 0.1);
    }

    /**
     * Tests add method.
     */
    @Test
    public void testAdd2() {
        double sum = math.add(-6.0, 6.0);
        assertEquals(0.0, sum, 0.1);
    }

    /**
     * Tests multiply method.
     */
    @Test
    public void testMultiply1() {
        double product = math.multiply(1.0, 5.0);
        assertEquals(5.0, product, 0.1);
    }

    /**
     * Tests multiply method.
     */
    @Test
    public void testMultiply2() {
        double product = math.multiply(20.0, 20.0);
        assertEquals(400.0, product, 0.1);
    }

    /**
     * Tests subtract method.
     */
    @Test
    public void testSubtract1() {
        double difference = math.subtract(0.0, 20.0);
        assertEquals(-20.0, difference, 0.1);
    }

    /**
     * Tests subtract method.
     */
    @Test
    public void testSubtract2() {
        double difference = math.subtract(20.0, 20.0);
        assertEquals(0.0, difference, 0.1);
    }

    /**
     * Tests divide method.
     */
    @Test
    public void testDivide1() {
        double division = math.divide(20, 10);
        assertEquals(2.0, division, 0.00001);
    }

    /**
     * Tests divide method.
     */
    @Test
    public void testDivide2() {
        double division = math.divide(20, 0);
        assertEquals(0.0, division, 0.00001);
    }

    /**
     * Tests absolute value method.
     */
    @Test
    public void testAbsolute1() {
        int abs = math.absoluteValue(1);
        assertEquals(1, abs);
    }

    /**
     * Tests absolute value method.
     */
    @Test
    public void testAbsolute2() {
        int abs = math.absoluteValue(-5000);
        assertEquals(5000, abs);
    }

    /**
     * Tests the random number generator method.
     */
    @Test
    public void testRandomNumberBetweenTenAndTwentyButNotFifteen() {
        HashSet<Integer> values = new HashSet<Integer>();

        for (int i = 0; i < 10000; i++) {
            int number = math.getRandomNumberBetweenTenAndTwentyButNotFifteen();
            boolean lessThanTen = number < 10;
            boolean greaterThanTwenty = number > 20;
            boolean notFifteen = number == 15;

            assertFalse(lessThanTen);
            assertFalse(greaterThanTwenty);
            assertFalse(notFifteen);
            values.add(number);
        }

        assertEquals(10, values.size());
    }

    /**
     * Tests the method that converts feet to kilometres.
     */
    @Test
    public void testFootToKM1() {
        double km = math.convertFeetToKilometres(1.0);
        assertEquals(0.0003048, km, 0.1);
    }

    /**
     * Tests the method that converts feet to kilometres.
     */
    @Test
    public void testFootToKM2() {
        double km = math.convertFeetToKilometres(892.0);
        assertEquals(0.272186, km, 0.1);
    }
    
    /**
     * Tests the method that returns the sum of the numbers
     * between 0 and the first parameter that are divisible
     * by the second parameter.
     */
    @Test
    public void testSumOfProducts() {
        int sumOfProducts = math.sumOfProducts(10, 3);
        assertEquals(18, sumOfProducts); // 3 + 6 + 9
    }
    
    /**
     * Tests the method that returns the sum of the numbers
     * between 0 and the first parameter that are divisible
     * by the second parameter.
     */
    @Test
    public void testSumOfProducts2() {
        int sumOfProducts = math.sumOfProducts(-10, 3);
        assertEquals(-18, sumOfProducts); // -3 + -6 + -9
    }
    
    /**
     * Tests the method that returns the sum of the numbers
     * between 0 and the first parameter that are divisible
     * by the second parameter.
     */
    @Test
    public void testSumOfProducts3() {
        int sumOfProducts = math.sumOfProducts(40, 5);
        assertEquals(180, sumOfProducts); // 5 + 10 + ... + 40
    }

}
