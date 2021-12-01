/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner mb  = new Scanner(System.in);
        System.out.println("Please enter the password to be checked.");
        String s = mb.nextLine();
        String strength = "normal strength";
        if(passwordValidator(s) == 1){ strength = "very weak";}
        if(passwordValidator(s) == 2){ strength = "weak";}
        if(passwordValidator(s) == 3){ strength = "strong";}
        if(passwordValidator(s) == 4){ strength = "very strong";}
        System.out.println("The password '" + s + "' is a " + strength +" password.");
    }

    public static int passwordValidator(String s){
        int n = numberCheck(s);
        int l = letterCheck(s);
        int sp = specialCheck(s);
        if(s.length() < 8 && (n == s.length())){
            return 1;
        }
        if(s.length() < 8 && (l == s.length())){
            return 2;
        }
        if(s.length() >= 8 && n != 0 && l != 0 && (sp == 0)){
            return 3;
        }
        if(s.length() >= 8 && (n != 0) && (l != 0) && (sp != 0)){
            return 4;
        }
        return 0;
    }

    public static int numberCheck(String s){
        String num = "0123456789";
        int c = 0;
        for(int i = 0; i < s.length();i++){
            if(num.contains(Character.toString(s.charAt(i)))){
                c++;
            }
        }
        return c;
    }

    public static int letterCheck(String s){
        String num = "abcdefghijklmnopqrstuvwxyz";
        int c = 0;
        for(int i = 0; i < s.length();i++){
            if(num.contains(Character.toString(s.charAt(i)))){
                c++;
            }
        }
        return c;
    }

    public static int specialCheck(String s){
        String num = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        int c = 0;
        for(int i = 0; i < s.length();i++){
            if(num.contains(Character.toString(s.charAt(i)))){
                c++;
            }
        }
        return c;
    }


}
