package ca.bcit.comp1510.assignment3.q1;

import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Course contains course related information
 * including Stutdent classes.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Course {
    
    /** MAX number of students. */
    public static final int MAX = 5;
    
    /** name of course. */
    private String name;
    
    /** students array. */
    private List<Student> students;

    /**
     * Course constructor.
     * @param name of course
     */
    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }
    
    /**
     * addStudent to students array.
     * @param s student to add
     */
    public void addStudent(Student s) {
        if (this.students.size() < MAX) {            
            students.add(s);
        }
    }

    /**
     * average of all students averages.
     * @return average of all students.
     */
    public double average() {
        double a = 0;
        for (int i = 0; i < this.students.size(); i++) {
            a += this.students.get(i).average();
        }
        DecimalFormat format = new DecimalFormat("#0.00");
        return Double.parseDouble(format.format(a / this.students.size()));
    }

    /**
     * role prints all students.
     */
    public void role() {
        System.out.println("Course: " + this.name);
        for (int i = 0; i < this.students.size(); i++) {
            System.out.println(this.students.get(i).toString());
        }
    }
    
}
