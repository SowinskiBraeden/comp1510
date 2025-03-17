package ca.bcit.comp1510.lab09;

import java.util.List;
import java.util.ArrayList;

import java.util.Iterator;

/**
 * CatHotel?
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class CatHotel {

    /** name of cat hotel. */
    private String name;
    
    /** cats in hotel. */
    private List<Cat> cats;
    
    
    /**
     * CatHotel Constructor.
     * @param name of hotel.
     */
    public CatHotel(String name) {
        this.name = name;
        cats = new ArrayList<Cat>();
    }

    /**
     * addCat to hotel list.
     * @param cat to add.
     */
    public void addCat(Cat cat) {
        cats.add(cat);
    }
    
    /**
     * removeAllGuests.
     */
    public void removeAllGuests() {
        cats.clear();
    }
    
    /**
     * guesCount of hotel.
     * @return numberOfGuests as int.
     */
    public int guestCount() {
        return cats.size();
    }
    
    /**
     * removeOldGuests kicks out cats over
     * max age.
     * @param maxAge of cat.
     * @return evicted cats int.
     */
    public int removeOldGuests(int maxAge) {
        int evicted = 0;
        
        Iterator<Cat> iterator = cats.iterator();
        List<Cat> newList = new ArrayList<Cat>();
        
        while (iterator.hasNext()) {
            Cat current = iterator.next();
            if (current.getAge() <= maxAge) {
                newList.add(current);
                continue;
            }
            evicted++;
        }
        
        cats = newList;
        
        return evicted;
    }
    
    /**
     * printGuestList from hotel.
     */
    public void printGuestList() {
        System.out.println("Hotel " + name + " guests:");
        
        for (int i = 0; i < cats.size() - 1; i++) {
            System.out.println(cats.get(i).toString());
        }
    }
}
