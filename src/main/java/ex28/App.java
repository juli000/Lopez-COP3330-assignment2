/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex28;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tot = 0;
        int curr = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a number:");
            curr = s.nextInt();
            tot += curr;
        }
        System.out.println("The total is " + tot);
    }
}
