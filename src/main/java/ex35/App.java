/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex35;


import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name:");
        String input = s.nextLine();
        ArrayList<String> names = new ArrayList<String>();
        names.add(input);
        while(!input.equals("")){
            System.out.println("Enter a name:");
            input = s.nextLine();
            names.add(input);
        }
        System.out.println("The winner is... "+ pickRand(names));
    }

    public static String pickRand(ArrayList<String> s){
        int g = (int) Math.floor((Math.random() * (4)));
        return s.get(g);
    }
}
