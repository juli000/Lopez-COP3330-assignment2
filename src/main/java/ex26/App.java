/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex26;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is your balance?");
        double b = s.nextDouble();
        System.out.println("What is the APR on the card (as a percent)?");
        double i = (s.nextDouble()/100.0)/365.0;
        System.out.println("What is the monthly payment you can make?");
        double p = s.nextDouble();
        System.out.println("It will take you " + PaymentCalculator.calculateMonthsUntilPaidOff(i,b,p) + " months to pay off this card.");
    }
}
