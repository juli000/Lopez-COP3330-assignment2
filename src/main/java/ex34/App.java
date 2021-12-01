/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex34;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones","Amanda Cullen", "Jeremy Goodwin"};
        System.out.println("There are 5 employees:");
        printNames(employees);
        System.out.println("Enter an employee name to remove");
        Scanner s = new Scanner(System.in);
        String remove = s.nextLine();
        int index = findName(employees,remove);
        System.out.println("There are now 4 employees:");
        printNames(remove(employees,index));



    }

    public static void printNames(String[] s){
        for (String value : s) {
            System.out.println(value);
        }
    }

    public static String[] remove(String[] s, int r){
        String[] finl = new String[s.length-1];
        for(int i = 0, c = 0; i < s.length; i++){
            if(i == r){
                continue;
            }
            finl[c++] = s[i];
        }
        return finl;
    }

    public static int findName(String[] s, String name){
        for(int i = 0; i < s.length; i++){
            if(s[i].equals(name)){
                return i;
            }
        }
        return 0;
    }
}
