package ex24;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        if(s1.length() != s2.length()){
            System.out.println("Words are not of equal length. Please try again.");
            return;
        }
        if(isAnagram(s1,s2)){
            System.out.println("\" " + s1 + "\" and \"" + s2 + "\" are anagrams.");
        }
        else{
            System.out.println("\" " + s1 + "\" and \"" + s2 + "\" are not anagrams.");
        }
    }
    public static boolean isAnagram(String s1, String s2){
        boolean f = true;
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        for(int i = 0; i < s1.length(); i++){
            if(c1[i] != c2[s2.length()-1-i]){
                f = false;
            }
        }
        return f;
    }
}
