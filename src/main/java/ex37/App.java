/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex37;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What's the minimum length?");
        int length = s.nextInt();

        System.out.println("How many special characters?");
        int special = s.nextInt();

        System.out.println("How many numbers?");
        int nums = s.nextInt();

        int letters = special + nums;

        ArrayList<Character> p = new ArrayList<>();
        while(length > 0){
            int choice = 1 + (int)(Math.random() * ((3 - 1) + 1));
            if(choice == 1 && letters > 0){
                p.add(randLet());
                length--;
                letters--;
            }
            if(choice == 2 && special > 0){
                p.add(randSpecial());
                length--;
                special--;
            }
            if(choice == 3 && nums > 0){
                p.add(randNum());
                length--;
                nums--;
            }
        }
        System.out.print("Your password is ");
        printNums(p);
    }

    public static char randSpecial(){
        String spec = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        return spec.charAt((int)Math.floor(Math.random()*(spec.length())));
    }

    public static char randLet(){
        String let = "abcdefghijklmnopqrstuvwxyz";
        return let.charAt((int)Math.floor(Math.random()*(let.length())));
    }

    public static char randNum(){
        String num = "0123456789";
        return num.charAt((int)Math.floor(Math.random()*(num.length())));
    }

    public static void printNums(ArrayList<Character> s){
        for (Character value : s) {
            System.out.print(value);
        }
    }
}
