package ca.bcit.comp1510.lab09;

import java.util.random.RandomGenerator;

/**
 * CatHotelDriver.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class CatHotelDriver {

    /**
     * main program entry.
     * @param args unused.
     */
    public static void main(String[] args) {
        RandomGenerator rand = RandomGenerator.getDefault();

        final int maxAge = 11;
        
        CatHotel hotel = new CatHotel("California");
        
        hotel.addCat(new Cat("Peter",   rand.nextInt(maxAge)));
        hotel.addCat(new Cat("Craig",   rand.nextInt(maxAge)));
        hotel.addCat(new Cat("John",    rand.nextInt(maxAge)));
        hotel.addCat(new Cat("Mark",    rand.nextInt(maxAge)));
        hotel.addCat(new Cat("Richard", rand.nextInt(maxAge)));
        hotel.addCat(new Cat("Bobby",   rand.nextInt(maxAge)));

        hotel.printGuestList();
        System.out.println(hotel.guestCount() + " guests\n");
        
        final int tooOld = 5;
        hotel.removeOldGuests(tooOld);
        System.out.println("Evicting cats older than 5");
        
        System.out.println(hotel.guestCount() + " guests\n");
  
        hotel.removeAllGuests();
        System.out.println("Evicting all guests");
        System.out.println(hotel.guestCount() + " guests\n");
    }
}
