/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex31;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your resting heart rate.");
        String rest = s.nextLine();
        while(!checkNum(rest)){
            System.out.println("Please enter a valid number.");
            rest = s.nextLine();
        }
        System.out.println("Enter your age.");
        String age = s.nextLine();
        while(!checkNum(age)){
            System.out.println("Please enter a valid number.");
            age = s.nextLine();
        }
        System.out.println("Resting pulse: " + rest + "         Age: " + age);
        System.out.println("Intensity        | Rate");
        System.out.println("-----------------|--------");
        double a = Double.parseDouble(age);
        double r = Double.parseDouble(rest);
        for(int i = 55; i < 100; i = i + 5){
            System.out.println(i + "%              | " + String.format("%.0f", rateCalc(a,r,i)) + " bpm");
        }
    }

    public static double rateCalc(double age, double rest, double inten){
        inten = inten/100.0;
        return Math.round((((220 - age) - rest) * inten) + rest);
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
