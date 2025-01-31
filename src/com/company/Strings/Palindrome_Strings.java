package com.company.Strings;

public class Palindrome_Strings {
    public static void main(String[] args) {
        String s = "abba";
        int low = 0;
        int high = s.length()-1;

        boolean flag = true;
        while(low<high) {
            if(s.charAt(low) != s.charAt(high)) {
                flag = false;
                break;
            }
            low++;
            high--;
        }

        System.out.println("Is the string palindrome ? " + flag);
    }
}
