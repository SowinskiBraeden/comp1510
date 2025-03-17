package ca.bcit.comp1510.lab09;

/**
 * Cat.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Cat {
    
    /** name of cat. */
    private final String name;
    
    /** age of cat in years. */
    private int age;
    
    /**
     * Cat constructor.
     * @param name string.
     * @param age int.
     */
    public Cat(String name, int age) {
        this.name = !name.equals("") ? name : "Cleo";
        this.age = age >= 0 ? age : 0;
    }
    
    /**
     * getName.
     * @return name string of cat.
     */
    public String getName() {
        return name;
    }
    
    /**
     * getAge.
     * @return age int of cat.
     */
    public int getAge() {
        return age;
    }
    
    /**
     * setAge.
     * @param age new age int.
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * toString.
     * @return cat data in string.
     */
    public String toString() {
        return name + " age " + age;
    }
}
