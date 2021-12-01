/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex33;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] out = {"Yes.", "No.", "Maybe.", "Ask again later." };
        System.out.println("What is your question?");
        String p = s.nextLine();
        System.out.println(pickRand(out));

    }

    public static String pickRand(String[] s){
        int g = (int) Math.floor((Math.random() * (4)));
        return s[g];
    }
}
