/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex30;

public class App {
    public static void main(String[] args) {
        for(int i = 1; i < 13; i++){
            for(int j = 1; j < 13; j++){
                printNum(i,j);
            }
            System.out.print("\n");
        }
    }

    public static void printNum(int i, int j){
        System.out.print(String.format("%1$5s", i*j));
    }
}
