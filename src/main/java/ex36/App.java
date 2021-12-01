/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "not done";
        ArrayList<String> nums = new ArrayList<String>();
        int c = -1;
        while (!input.equals("done")) {
            System.out.println("Enter a number:");
            input = s.nextLine();
            while(!checkNum(input) && !input.equals("done")){
                System.out.println("Please enter a valid number");
                input = s.nextLine();
            }
            nums.add(input);
            c++;
        }
        nums.remove(c);
        printNums(nums);
        System.out.println("\nThe average is " + avg(nums));
        System.out.println("The minimum is " + min(nums));
        System.out.println("The maximum is " + max(nums));
        System.out.println("The standard deviation is " + std(nums));

    }

    public static void printNums(ArrayList<String> s){
        System.out.print("Numbers: ");
        for (String value : s) {
            System.out.print(value + " ");
        }
    }
    public static double avg(ArrayList<String> s){
        double tot = 0;
        for (String value : s) {
            tot += Double.parseDouble(value);
        }
        return tot/(double) s.size();
    }
    public static int max(ArrayList<String> s){
        String max = s.get(0);
        int one = Integer.parseInt(max);
        for (String value : s) {
            if (one < Integer.parseInt(value)) {
                one = Integer.parseInt(value);
            }
        }
        return one;
    }
    public static int min(ArrayList<String> s){
        String min = s.get(0);
        int one = Integer.parseInt(min);
        for (String value : s) {
            if (one > Integer.parseInt(value)) {
                one = Integer.parseInt(value);
            }
        }
        return one;
    }
    public static double std(ArrayList<String> s){
        double mean = avg(s);
        double tot = 0;
        double curr;
        for (String value : s) {
            curr = Math.pow(Double.parseDouble(value) - mean, 2);
            tot += curr;
        }
        tot = tot/s.size();
        return (Math.sqrt(tot));
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
