/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex24;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams.");
        System.out.println("Enter the first string: ");
        String s1 = s.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = s.nextLine();
        if(s1.length() != s2.length()){
            System.out.println("Words are not of equal length. Please try again.");
            return;
        }
        if(isAnagram(s1,s2)){
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
        }
        else{
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are not anagrams.");
        }
    }
    public static boolean isAnagram(String s1, String s2){
        boolean f = true;
        char[] c1 = s1.toLowerCase().toCharArray();
        for(int i = 0; i < s1.length(); i++){
            if(s2.indexOf(c1[i]) == -1){
                f = false;
                return f;
            }
        }
        return f;
    }
}
