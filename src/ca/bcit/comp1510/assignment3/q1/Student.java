package ca.bcit.comp1510.assignment3.q1;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;

    /** testScore1. */
    private double testScore1;

    /** testScore2. */
    private double testScore2;
    
    /** testScore3. */
    private double testScore3;

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     */
    public Student(
        String first, 
        String last, 
        Address home,
        Address school
    ) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;

    }

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     * @param testScore1 is a double of their first test score
     * @param testScore2 is a double of their seccond test score
     * @param testScore3 is a double of their third test score
     */
    public Student(
        String first,
        String last, 
        Address home, 
        Address school,
        double testScore1,
        double testScore2,
        double testScore3
    ) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }

    /**
     * setTestScore updates a selected test to
     * a new score.
     * @param test to select
     * @param score to update test to
     */
    public void setTestScore(int test, double score) {
        switch (test) {
            case 1 -> this.testScore1 = score;
            case 2 -> this.testScore2 = score;
            default -> this.testScore3 = score;
        }
    }

    /**
     * getTestScore of a given test.
     * @param test to get score of
     * @return score of test
     */
    public double getTestScore(int test) {
        double score;
        switch (test) {
            case 1 -> score = this.testScore1;
            case 2 -> score = this.testScore2;
            default -> score = this.testScore3;
        }
        return score;
    }
    
    /**
     * average calculation of all 3 test scores.
     * @return average
     */
    public double average() {
        final int tests = 3;
        return (this.testScore1 + this.testScore2 + this.testScore3) / tests;
    }
    
    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test Score 1:\n" + testScore1 + "\n"; 
        result += "Test Score 2:\n" + testScore2 + "\n"; 
        result += "Test Score 3:\n" + testScore3 + "\n"; 
        result += "Average Score:\n" + average(); 
        
        return result;
    }
}

