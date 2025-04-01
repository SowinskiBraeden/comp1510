package ca.bcit.comp1510.lab11;

/**
 * Transaction of items.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Transaction {

    /** items in transaction. */
    private Item[] items;
    
    /** totalPrice of transaction. */
    private double totalPrice;
    
    /** itemCount of transaction. */
    private int itemCount;
    
    /**
     * Tramsaction constructor.
     * @param size of items;
     */
    public Transaction(int size) {
        this.items = new Item[size];
        this.totalPrice = 0;
        this.itemCount = 0;
    }
    
    public void addToCart(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
    }
}
