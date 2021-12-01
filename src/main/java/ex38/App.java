/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex38;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a list of numbers, separated by spaces: ");
        String nums = s.nextLine();
        System.out.print("The even numbers are ");
        printNums(filterEvenNumbers(nums));
    }

    public static ArrayList<Integer> filterEvenNumbers(String s){
        ArrayList<Integer> a = new ArrayList<>();
        String[] split = s.split(" ");
        for (String value : split) {
            if (!Objects.equals(value, " ") && (Integer.parseInt(value) % 2 == 0)) {
                a.add(Integer.parseInt(value));
            }
        }
        return a;
    }

    public static void printNums(ArrayList<Integer> s){
        for (Integer value : s) {
            System.out.print(value + " ");
        }
    }
}
