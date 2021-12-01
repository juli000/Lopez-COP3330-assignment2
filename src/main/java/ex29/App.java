/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex29;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the rate of return?");
        String in = s.nextLine();
        while(in.equals("0") || !checkNum(in)){
            System.out.println("Sorry. That's not a valid input.");
            in = s.nextLine();
        }
        int n = 72/Integer.parseInt(in);
        System.out.println("It will take " + n + " years to double your initial investment.");
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
