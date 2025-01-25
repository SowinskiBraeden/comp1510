package lab2;

/**
 * Students prints a table of student info.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Students {
    
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
       
        final int maxScore = 101;
        Student[] students = {
            new Student("Joe",
                    (int) (Math.random() * maxScore),
                    (int) (Math.random() * maxScore)),
            new Student("William",
                    (int) (Math.random() * maxScore),
                    (int) (Math.random() * maxScore)),
            new Student("Mary Sue",
                    (int) (Math.random() * maxScore),
                    (int) (Math.random() * maxScore)),
            new Student("Peng",
                    (int) (Math.random() * maxScore),
                    (int) (Math.random() * maxScore)),
            new Student("Kwon",
                    (int) (Math.random() * maxScore),
                    (int) (Math.random() * maxScore)),
        };

        String nameBuff = " ";
        String labBuff = " ";
        String bonusBuff = " ";
        
        // Yes, longer than 80 characters is too long, lets just split
        // our for loops in half to please the checkstyle gods.
        // And dont think we can put students[i].getName().length()
        // into a variable, as well as lab and bonus.
        // because then the main functions has too many statements.
        // Thank you checkstyle
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().length() > nameBuff.length()) {
                for (int j = 0; j < students[i].getName().length() 
                        - "name ".length(); j++) {
                    nameBuff += " ";
                }
            }

            if (("" + students[i].getLab()).length() > labBuff.length()) {
                for (int j = 0; j < ("" + students[i].getLab()).length() 
                        - "lab ".length(); j++) {
                    labBuff += " ";
                }
            }
            
            if (("" + students[i].getBonus()).length() > bonusBuff.length()) {
                for (int j = 0; j < ("" + students[i].getBonus()).length() 
                        - "bonus ".length(); j++) {
                    bonusBuff += " ";
                }
            }
        }
        
        // Print out neat header
        System.out.println("///////////////////"
                + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("        == Student Points ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                + "///////////////////");

        // Print column names with proper padding
        System.out.printf("Name%slab%sBonus%sTotal\n",
                nameBuff, 
                labBuff, 
                bonusBuff
        );
        System.out.printf("----%s---%s-----%s-----\n", 
                nameBuff,
                labBuff,
                bonusBuff
        );
        
        for (int i = 0; i < students.length; i++) {
            String thisNameBuff = "";
            String thisLabBuff = "";
            String thisBonusBuff = "";
            
            // More splitting for loops in half because we cant put the long
            // calculated bounds in their own int because can't have more than
            // 30 statements within a function. Thank you very very much.
            // We all appreciate checkstyle rules.
            
            for (int j = 0; j < (nameBuff.length() + "name".length())
                    - students[i].getName().length(); j++) {
                thisNameBuff += " ";                
            }
            
            for (int j = 0; j < (labBuff.length() + "lab".length())
                    - ("" + students[i].getLab()).length(); j++) {
                thisLabBuff += " ";                
            }
            
            for (int j = 0; j < (bonusBuff.length() + "bonus".length())
                    - ("" + students[i].getBonus()).length(); j++) {
                thisBonusBuff += " ";
            }
            
            System.out.println(students[i].getName() 
                    + thisNameBuff 
                    + students[i].getLab()
                    + thisLabBuff 
                    + students[i].getBonus()
                    + thisBonusBuff 
                    + students[i].getTotal()
            );
        }
    }
}
