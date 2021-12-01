/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Julio Lopez
 */
package ex40;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap<String, Employee> records = new TreeMap<>();
        String[] last = {"Jackson", "Jacobson", "Johnson", "Michaelson", "Weber", "Xiong"};
        records.put(last[0], new Employee("Jacquelyn",last[0],"DBA",""));
        records.put(last[1], new Employee("Jake",last[1],"Programmer",""));
        records.put(last[2], new Employee("John",last[2],"Manager","2016-12-31"));
        records.put(last[3], new Employee("Michaela",last[3],"District Manager","2015-12-19"));
        records.put(last[4], new Employee("Sally",last[4],"Web Developer","2015-12-18"));
        records.put(last[5], new Employee("Tou",last[5],"Software Engineer","2016-10-05"));
        System.out.println("Enter a search string:");
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        printRecords(records, in);
    }

    public static void printRecords(TreeMap<String, Employee> records, String input){
        String comb = "";
        System.out.println("Name                 |Position              |Separation Date");
        System.out.println("---------------------|----------------------|----------------");
        for(Map.Entry<String, Employee> person : records.entrySet()){
            comb = person.getValue().getFirst() + " " + person.getKey();
            if(comb.contains(input)) {
                System.out.printf("%-20s | %-20s | %-20s\n", comb, person.getValue().getPos(), person.getValue().getSepDate());
            }
        }
    }
}
