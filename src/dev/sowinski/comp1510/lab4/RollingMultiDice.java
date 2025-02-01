package dev.sowinski.comp1510.lab4;

/**
 * RollingMultiDice test the modified MultiDie class.
 * 
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class RollingMultiDice {

    /**
     * main program entry.
     * @param args cli input unused
     */
    public static void main(String[] args) {
        final int numSides = 12;
        
        MultiDie die = new MultiDie(numSides);
        
        System.out.println(die.max);
        /*
         * 1. Do you need getters and setters for max? Should you have them?
         * 
         *    You don't need a getter for max, or a setter 
         *    for max as it is a constant value that is set
         *    in the constructor
         *    
         *    
         * 2. Can you have getters and setters for max?
         * 
         *    You can have a getter, though its not needed for
         *    max. You can't have a setter, it is a constant
         *    value.
         *    
         *    
         * 3. Why do you think it makes sense (or not) to have max be final?
         * 
         *    It makes sense to have max as a final (constant)
         *    as we do not intend for a die to change its number
         *    of faces. It has a single number of faces that does
         *    not change.
         *    
         *    
         * 4. What does max’s being final say about the abstraction of a 
         *    MultiDie object?
         * 
         *    
         * 
         * 5. Is max an instance variable.
         *    
         *    Yes max is a instance variable as it is defined in the 
         *    class level and does not have the static modifier. Each
         *    object instance of this class will have unique max values.
         *    
         * 6. Should you use a record for your Die? Why or why not?
         *  
         *    No, using a record means max will be defined as a final
         *    instance variable and all MultiDie objects will have the 
         *    same max value.
         *
         */

    }
}
