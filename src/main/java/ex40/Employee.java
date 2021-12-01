/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex40;

public class Employee {
    String first;
    String last;
    String pos;
    String sepDate;

    public Employee(String firstN, String lastN, String posi, String sep){
        first = firstN;
        last = lastN;
        pos = posi;
        sepDate = sep;
    }
    String getFirst(){return first;}
    String getLast(){return last;}
    String getPos(){return pos;}
    String getSepDate(){return sepDate;}
}
