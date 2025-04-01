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

    /**
     * addToCart creates an item to add to cart.
     * @param name of item
     * @param price of item
     * @param quantity of item
     */
    public void addToCart(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        
        if (this.itemCount == this.items.length) {
            
        }

        this.items[itemCount] = item;
        this.itemCount++;
        
        this.totalPrice += price * quantity;
    }

    /**
     * addToCart adds existing item to cart.
     * @param item to add
     */
    public void addToCart(Item item) {
        this.items[itemCount] = item;
        this.itemCount++;
        
        this.totalPrice += item.getPrice() * item.getQuantity();
    }
    
    /** increaseSize of cart. */
    public void increaseSize() {
        
    }
}
