package ca.bcit.comp1510.lab08;

import java.util.Scanner;
import java.util.random.RandomGenerator;

/**
 * Games game stuff.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Games {
    
    /** score holds user score. */
    private int score;
 
    /** scan scans stuff. */
    private Scanner scan;
    
    /** rand generates random stuff. */
    private RandomGenerator rand;
    
    /** Games constructor. */
    public Games() {
        score = 0;
        scan = new Scanner(System.in);
        rand = RandomGenerator.getDefault();
    }
    
    /** guessANumber is a minigame. */
    public void guessANumber() {
        System.out.println("I've picked a random number between 0 and 100");
        System.out.println("Can you guess it?");
        System.out.println("Guess the number");
        
        final int maxNum = 101;
        int randomNumber = rand.nextInt(maxNum);
        
        final int max = 5;
        int guess = -1;
        for (int i = 0; i < max; i++) {
            if (guess != -1) {
                String diff = guess > randomNumber ? "high" : "low";
                System.out.println("Too " + diff + ", guess again!");
            }
            
            guess = scan.nextInt();
            if (guess == randomNumber) {
                System.out.println("RIGHT!");
                System.out.println("5 points!\n");
                final int won = 5;
                score += won;
                return;
            }
        }
        
        System.out.println("You failed!");
        System.out.println("No points!\n");
    }

    /** valid validates user input for rps. 
     * @param in String input
     * @return valid boolean
     * */
    private static boolean valid(String in) {
        return (
                in.toUpperCase().equals("ROCK")
                || in.toUpperCase().equals("PAPER")
                || in.toUpperCase().equals("SCISSORS")
               );
    }
    
    /** rockPaperScissors is a fun game. */
    public void rockPaperScissors() {
        final int maxNum = 3;
        final int rock = 0;
        final int paper = 1;
        int handOpt = rand.nextInt(maxNum);
        
        String hand = handOpt == rock ? "ROCK" 
                    : handOpt == paper ? "PAPER" 
                    : "SCISSORS";
        
        System.out.println("I've picked on of ROCK, PAPER, and SCISSORS");
        System.out.println("Which one do you choose?");
        
        String input = "";
        do {
            System.out.print("> ");
            input = scan.next();
            if (!valid(input)) {
                System.out.println(input + " is not valid.");
            }
        } while (!valid(input));
        
        input = input.toUpperCase();
        
        System.out.println(input + " vs " + hand);
        
        if (
                input.equals("ROCK") && hand.equals("SCISSORS") 
                || input.equals("SCISSORS") && hand.equals("PAPER")
                || input.equals("PAPER") && hand.equals("ROCK")
        ) {
            System.out.println("You win!");
            System.out.println("5 points!\n");            
            final int win = 5;
            score += win;
        } else if (input.equals(hand)) {
            System.out.println("Tie!");
            System.out.println("No points gained or losed.");
        } else {
            System.out.println("You lost!");
            System.out.println("Minus 3 points!\n");
            final int loss = -3;
            score += loss;
        }
    }
    
    /**
     * play starts the game.
     */
    public void play() {
        System.out.println("Welcome to the Games program!");

        final int scoreOpt = 1;
        final int guessOpt = 2;
        final int rpsOpt = 3;
        final int quitOpt = 4;

        int option = -1;
        do {
            System.out.println("Make your choice (enter a number):");
            System.out.println("1. See your score");
            System.out.println("2. Guess a number");
            System.out.println("3. Play Rock, Paper, Scissors");
            System.out.println("4. Quit");
            System.out.print("> ");
            
            if (!scan.hasNextInt()) {
                System.out.println(scan.next() + " is not a valid option.\n");
                continue;
            }
            
            option = scan.nextInt();
            
            switch (option) {
                case scoreOpt -> System.out.println("Score: " + score + "\n");
                case guessOpt -> guessANumber();
                case rpsOpt -> rockPaperScissors();
                case quitOpt -> System.out.println("Quiting...");
                default -> System.out.println(option
                            + " is not a valid option.\n");
            }
            
        } while (option != quitOpt);
    }
}
