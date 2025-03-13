package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TestThisTest {

    TestThis test = new TestThis();
    
    @Test
    void testLargestIntIntInt1() {
        int result = test.largest(3, 2, 1);
        assertEquals(3, result);
    }
    
    @Test
    void testLargestIntIntInt2() {
        int result = test.largest(4, 6, 5);
        assertEquals(6, result);
    }    

    @Test
    void testLargestIntIntInt3() {
        int result = test.largest(9, 8, 12);
        assertEquals(12, result);
    }

    @Test
    void testLargestListOfInteger1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        
        int result = test.largest(list);
        assertEquals(3, result);
    }

    @Test
    void testLargestListOfInteger2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(6);
        list.add(5);
        
        int result = test.largest(list);
        assertEquals(6, result);
    }
    

    @Test
    void testLargestListOfInteger3() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(8);
        list.add(12);
        list.add(4);
        
        int result = test.largest(list);
        assertEquals(12, result);
    }
}
