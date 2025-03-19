package ca.bcit.comp1510.assignment2.q3;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Primes {

    /** primes list up to nth number. */
    private List<Boolean> primes;
    
    /**
     * Primes constructor.
     * @param n int
     */
    public Primes(int n) {
        primes = new ArrayList<Boolean>();
        calculatePrimes(n);
    }
    
    /** printPrimes. */
    public void printPrimes() {
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    /** 
     * countPrimes. 
     * @return int number of primes
     * */
    public int countPrimes() {
        int count = 0;
        
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * isPrime.
     * @param n int number
     * @return boolean
     */
    public boolean isPrime(int n) {
        return primes.get(n);
    }
    
    /** 
     * calculatePrimes. 
     * @param n int number of primes
     * */
    private void calculatePrimes(int n) {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <= n; i++) {
            numbers.add(i);
            primes.add(i, false);
        }
        
        for (int i = 0; i < numbers.size() - 1; i++) {  
            if (numbers.get(i) != -1 && i != 0 && i != 1) {
                for (int j = 2; j < (n / i) + 1; j++) {
                    numbers.set(i * j, -1);
                }
                primes.set(i, true);
            }
        }
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int bound = 0;
        boolean valid = false;
        
        do {
            System.out.print("Enter an upper bound: ");
            if (!scan.hasNextInt()) {
                System.out.println(scan.next() + " is not a valid integer.\n");
                continue;
            }
            
            bound = scan.nextInt();
            
            if (bound <= 1) {
                System.out.println("Bound must be greater than 1.\n");
                continue;
            }
            
            valid = true;

        } while (!valid);

        scan.close();
        
        Primes p = new Primes(bound);
        
        p.printPrimes();
    }
}
