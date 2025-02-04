package ca.bcit.comp1510.lab04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private final Student s = new Student("Tashi", "Delek", 1985, 
            "A00234534", 84);
    private String studentStr = "Tashi Delek 1985 A00234534 84";
    @Test
    void testCreation() {
        assertSame("Tashi", s.getFirstName());
        assertSame("Delek", s.getLastName());
        assertEquals(1985, s.getBirthYear());
        assertSame("A00234534", s.getStudentNumber());
        assertEquals(84, s.getGradeAverage());
    }

    @Test
    void testFirstName() {
        s.setFirstName("Drolma");
        assertSame("Drolma", s.getFirstName());
    }

    @Test
    void testLastName() {
        s.setLastName("Rabten");
        assertSame("Rabten", s.getLastName());
    }

    @Test
    void testBirthYear() {
        s.setBirthYear(2001);
        assertEquals(2001, s.getBirthYear());
    }
    @Test
    void testStudentNumber() {
        s.setStudentNumber("A00384495");
        assertSame("A00384495", s.getStudentNumber());
    }
    @Test
    void testGradeAverage() {
        s.setGradeAverage(78);
        assertEquals(78, s.getGradeAverage());
    }
    @Test
    void testToString() {
        assertEquals(studentStr, s.toString());
    }

}
