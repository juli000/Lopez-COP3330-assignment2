/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex26;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double i, double b, double p){
        return  Math.ceil(((-1/30.0)*Math.log(1+(b/p)*(1-Math.pow((1+i),30)))/Math.log(1+i)));
    }
}
