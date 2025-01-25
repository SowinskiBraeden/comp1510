package lab2;

/**
 * Student holds information of a student.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Student {
    
    /**
     * Student holds student info.
     * @param name student name
     */
    private String name;

    /**
     * lab points.
     * @param lab student points for lab
     */
    private int lab;
    
    /**
     * bonus points.
     * @param bonus student points for bonus
     */
    private int bonus;

    /**
     * total points.
     * @param total is lab + bonus  
     */
    private int total;
    
    /**
     * Student constructor.
     * @param newName  name of student
     * @param newLab   lab points of student
     * @param newBonus bonus points of student
     */
    public Student(String newName, int newLab, int newBonus) {
        name = newName;
        lab = newLab;
        bonus = newBonus;
        total = lab + bonus;       
    }
    
    /**
     * getName returns name.
     * @return name string
     */
    public String getName() {
        return name;
    }

    /**
     * getLab returns lab.
     * @return lab int
     */
    public int getLab() {
        return lab;
    }

    /**
     * getBonus returns bonus.
     * @return bonus int
     */
    public int getBonus() {
        return bonus;
    }
 
    /**
     * getTotal returns total.
     * @return total int
     */
    public int getTotal() {
        return total;
    }
}
