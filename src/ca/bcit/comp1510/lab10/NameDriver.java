package ca.bcit.comp1510.lab10;

import java.util.List;
import java.util.ArrayList;

/**
 * NameDriver drives Name.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class NameDriver {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        List<Name> names = new ArrayList<Name>();
        
        names.add(new Name("Braeden", "Sowinski"));
        names.add(new Name("Mitch", "Paredes"));
        names.add(new Name("Calvin", "B", "LastName"));
        names.add(new Name("Joaquin", "Paredes"));
        names.add(new Name("Calvin", "A", "LastName"));
        
        names.sort(null);
        
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i).toString());
        }
    }
}
