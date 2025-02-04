package dev.sowinski.comp1510.lab4;

/*
 * To be updated, cannot find StudentTest.java
 * file on D2L.
 */

/** 
 * Student contains student info.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Student {
    
    /** firstName student first name as String. */
    private String firstName;
    
    /** lastName student last name as String. */
    private String lastName;
    
    /** birthYear student year of birth as int. */
    private int birthYear;
    
    /** studentNumber student id number. */
    private String studentNumber;
    
    /** gpa student GPA as int. */
    private int gpa;
    
    /**
     * Student constructor.
     * @param first student firstname
     * @param last student lastname
     * @param yearOfBirth student birth year
     * @param id student number
     * @param studentGPA student gpa
     */
    public Student(
            String first, 
            String last, 
            int yearOfBirth,
            String id,
            int studentGPA
    ) {
        firstName = first;
        lastName = last;
        birthYear = yearOfBirth;
        studentNumber = id;
        gpa = studentGPA;
    }

    /**
     * getFirstName returns student first name.
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setFirstName updates student first name.
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getLastName returns student last name.
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setLastName updates student last name.
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getBirthYear returns student year of birth.
     * @return the birthYear
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * setBirthYear updates student year of birth.
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * getGPA returns student GPA.
     * @return the gpa
     */
    public int getGradeAverage() {
        return gpa;
    }

    /**
     * setGPA update student GPA.
     * @param newGPA the gpa to set
     */
    public void setGradeAverage(int newGPA) {
        this.gpa = newGPA;
    }
 
    /**
     * getStudentNumber return student id number.
     * @return studentNumber as string
     */
    public String getStudentNumber() {
        return studentNumber;
    }
    
    /**
     * setStudentNumber updates student id number.
     * @param studentNumber new student id number
     */
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    /**
     * toString concatonates student information.
     * @return student info as a String
     */
    public String toString() {
        return firstName + " "
                + lastName + " "
                + birthYear + " "
                + studentNumber + " "
                + gpa;
    }
}
