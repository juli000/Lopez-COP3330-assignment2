/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String name = s.nextLine();
        System.out.println("Enter the last name:");
        String last= s.nextLine();
        System.out.println("Enter the ZIP code:");
        String zip = s.nextLine();
        System.out.println("Enter the employee ID:");
        String eid = s.nextLine();
        System.out.println(validateInput(name,last,zip,eid));
    }

    public static boolean checkFill(String s){
        return s.length() > 0;
    }
    public static boolean check2(String s){
        return s.length() > 1;
    }
    public static boolean checkForm(String s){
        return Pattern.matches("^(?:[a-zA-z]{2}-)[0-9]{4}$", s);
    }
    public static boolean checkNum(String s){
        return Pattern.matches("\\b\\d{5}\\b",s);
    }
    public static String validateInput(String a, String b, String c, String d){
        String r = "";
        boolean cf1 = !checkFill(a);
        boolean c21 = !check2(a);
        boolean cf2 = !checkFill(b);
        boolean c22 = !check2(b);
        boolean form = !checkForm(d);
        boolean zip = !checkNum(c);
        if(c21){
            r += "The first name must be at least 2 characters long.\n";
        }
        if(c22){
            r += "The last name must be at least 2 characters long.\n";
        }
        if(cf1){
            r += "The first name must be filled in.\n";
        }
        if(cf2){
            r += "The last name must be filled in.\n";
        }
        if(form){
            r += "The employee ID must be in the format of AA-1234.\n";
        }
        if(zip){
            r += "The zipcode must be a 5 digit number.\n";
        }
        if(r.length() == 0){
            r += "There were no errors found.";
        }
        return r;
    }

}
