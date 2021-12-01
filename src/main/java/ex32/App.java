/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex32;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!\n");
        boolean play = true;
        int tries = 10;
        String wish;
        String d;
        while(play){
            tries = 10;
            System.out.println("Enter the difficulty level(1, 2, or 3): ");
            d = s.nextLine();
            while (!checkNum(d)) {
                System.out.println("Please enter a valid number.");
                d = s.nextLine();
            }
            int difficulty = Integer.parseInt(d);
            int max = 0;int min = 1;

            if (difficulty == 1) {max = 10;}
            if (difficulty == 2) {max = 100;}
            if (difficulty == 3) {max = 1000;}

            double num = Math.floor((Math.random() * (max - min + 1) + min));

            System.out.println("I have my number. What's your guess?");
            String guess = s.nextLine();

            boolean win = false;
            while (tries > 0) {
                if (!checkNum(guess)) {
                    System.out.println("You entered an invalid number and that wasted a try!\nGuess again:");
                    tries--;
                    guess = s.nextLine();
                } else {
                    int n = Integer.parseInt(guess);
                        if (n > num) {
                            System.out.println("Too high. Guess again:");
                            tries--;
                            n = s.nextInt();
                        }
                        if (n < num) {
                            System.out.println("Too low. Guess again:");
                            tries--;
                            n = s.nextInt();
                        }
                        if (n == num) {
                            tries--;
                            System.out.println("You got it in " + (10 - tries) + " guesses!");
                            win = true;
                            tries = 0;
                        }
                }
            }
            if (tries == 0 && !win) {
                System.out.println("You did not guess the number. My number was " + num);
                System.out.println("Do you wish to play again? (Y/N)");
                wish = s.nextLine();
                if(wish.equalsIgnoreCase("N")){
                    play  = false;
                }
            }
        }
    }

    public static boolean checkNum(String s){
        try{
            double n = Double.parseDouble(s);
        } catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
