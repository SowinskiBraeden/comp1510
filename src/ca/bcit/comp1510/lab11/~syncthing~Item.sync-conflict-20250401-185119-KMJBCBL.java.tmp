package ca.bcit.comp1510.lab11;

import java.text.DecimalFormat;
import java.util.NumberFormat;

/**
 * Item class for POS System.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Item {

    /** name of item. */
    private final String name;
     
    /** price of item. */
    private final double price;
    
    /** quanitity of item. */
    private final int quantity;
    
    /**
     * Item constructor.
     * @param name of item
     * @param price of item
     * @param quantity of item
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        

        DecimalFormat format = new DecimalFormat("#0.00");
        return Double.parseDouble(format.format(a / this.students.size()));
        
        this.price = 
    }
    
    /**
     * Item constructor with default quantity.
     * @param name of item
     * @param price of item
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    /**
     * getName of time.
     * @return name of item
     */
    public String getName() {
        return this.name;
    }

    /**
     * getPrice of item.
     * @return price of item
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * getQuantity of item.
     * @return quantity of item
     */
    public int getQuantity() {
        return this.quantity;
    }
    
    /**
     * toString gives string representation of item.
     * @return string of item.
     */
    public String toString() {
        return this.name + " $" + this.price 
                + " x" + this.quantity;
    }
}
