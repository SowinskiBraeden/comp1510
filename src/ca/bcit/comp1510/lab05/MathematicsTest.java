package ca.bcit.comp1510.lab05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * MathematicsTest.
 * 
 * @author BCIT
 * @version 1.0
 */
public class MathematicsTest {

    /**
     * The Mathematics object to test.
     */
    private Mathematics math;

    /**
     * Creates a new Mathematics objects before each test is executed.
     * 
     * @throws Exception
     *             if a Mathematics object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        math = new Mathematics();
    }

    /**
     * Test method for the value of PI.
     */
    @Test
    public void testPIValue() {
        assertEquals(3.14159, Mathematics.PI, 0.00001);
    }

    /**
     * Tests getCircleArea method.
     */
    @Test
    public void testGetCircleArea1() {
        double area = math.getCircleArea(1.0);
        assertEquals(3.14159, area, 0.00001);
    }

    /**
     * Tests getCircleArea method.
     */
    @Test
    public void testGetCircleArea2() {
        double area = math.getCircleArea(15.0);
        assertEquals(706.858347058, area, 0.00001);
    }

     /**
     * Tests the method that sums the positive integers
     * between 0 and the specified value.
     */
    @Test
    public void testSumOfInts() {
        int sumOfInts = math.sumOfInts(0);
        assertEquals(0, sumOfInts);
    }
    
    /**
     * Tests the method that sums the positive integers
     * between 0 and the specified value.
     */
    @Test
    public void testSumOfInts2() {
        int sumOfInts = math.sumOfInts(10);
        assertEquals(55, sumOfInts);
    }
    
    /**
     * Tests the method that sums the positive integers
     * between 0 and the specified value.
     */
    @Test
    public void testSumOfInts3() {
        int sumOfInts = math.sumOfInts(49);
        assertEquals(1225, sumOfInts);
    }
    
    /**
     * Tests the method that sums the positive integers
     * between 0 and the specified value.
     */
    @Test
    public void testSumOfInts4() {
        int sumOfInts = math.sumOfInts(-49);
        assertEquals(0, sumOfInts);
    }
    
    /**
     * Tests the method that returns true if a specified
     * number is positive, else false.
     */
    @Test
    public void testIsPositive() {
        boolean isPositive = math.isPositive(2);
        assertEquals(true, isPositive);
    }
    
    /**
     * Tests the method that returns true if a specified
     * number is positive, else false.
     */
    @Test
    public void testIsPositive2() {
        boolean isPositive = math.isPositive(-2);
        assertEquals(false, isPositive);
    }
    
    /**
     * Tests the method that returns true if a specified
     * number is positive, else false.
     */
    @Test
    public void testIsPositive3() {
        boolean isPositive = math.isPositive(0);
        assertEquals(false, isPositive);
    }
    
    /**
     * Tests the method that returns true if a specified
     * number is even, else false.
     */
    @Test
    public void testIsEven() {
        boolean isEven = math.isEven(0);
        assertEquals(true, isEven);
    }
    
    /**
     * Tests the method that returns true if a specified
     * number is even, else false.
     */
    @Test
    public void testIsEven2() {
        boolean isEven = math.isEven(1);
        assertEquals(false, isEven);
    }
    
    /**
     * Tests the method that returns true if a specified
     * number is even, else false.
     */
    @Test
    public void testIsEven3() {
        boolean isEven = math.isEven(2);
        assertEquals(true, isEven);
    }
    
    /**
     * Tests the method that returns the sum of the even
     * numbers between 0 and the specified value inclusive.
     */
    @Test
    public void testSumOfEvens() {
        int sumOfEvens = math.sumOfEvens(0);
        assertEquals(0, sumOfEvens);
    }
    
    /**
     * Tests the method that returns the sum of the even
     * numbers between 0 and the specified value inclusive.
     */
    @Test
    public void testSumOfEvens2() {
        int sumOfEvens = math.sumOfEvens(10);
        assertEquals(30, sumOfEvens);
    }
    
    /**
     * Tests the method that returns the sum of the even
     * numbers between 0 and the specified value inclusive.
     */
    @Test
    public void testSumOfEvens3() {
        int sumOfEvens = math.sumOfEvens(-10);
        assertEquals(-30, sumOfEvens);
    }
    
}
