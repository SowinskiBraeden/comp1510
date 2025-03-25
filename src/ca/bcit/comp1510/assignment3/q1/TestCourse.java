package ca.bcit.comp1510.assignment3.q1;

/**
 * TestCourse tests Course class.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class TestCourse {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Course comp1510 = new Course("Programming Methods");
        
        final double perfect = 100.0;
        comp1510.addStudent(new Student(
            "Braeden",
            "Sowinski",
            new Address("123 ABC St.", "Surrey", "BC", "A1B 2C3"),
            new Address("3700 Willington Ave.", "Burnaby", "BC", "V5G 3H2"),
            perfect,
            perfect,
            perfect
        ));
        
        final double bad1 = 73.7;
        final double bad2 = 69.69;
        final double okay = 84.5;
        comp1510.addStudent(new Student(
            "Joker",
            "Student",
            new Address("321 ABC St.", "Vancouver", "BC", "X1Y 2Z3"),
            new Address("3700 Willington Ave.", "Burnaby", "BC", "V5G 3H2"),
            bad1,
            bad2,
            okay
        ));
        

        final double mid1 = 83.21;
        final double mid2 = 79.97;
        comp1510.addStudent(new Student(
            "Joker",
            "Student",
            new Address("987 XYZ St.", "Toronto", "Quebec", "ABC 123"),
            new Address("3700 Willington Ave.", "Burnaby", "BC", "V5G 3H2"),
            mid1,
            mid2,
            okay
        ));
        
        comp1510.role();
        System.out.println("Programming Methods Average: " 
                + comp1510.average());
    }
}
