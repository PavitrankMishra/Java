package com.company.Strings.Easy;

public class Palindrome_String {
    public static void main(String[] args) {
        String s = "abbfa";
        int left = 0;
        int right = s.length()-1;
        while(left<right) {
            if(s.charAt(left) != s.charAt(right)) {
                System.out.println("The string is palindrome: " + false);
                return;
            }
            left++;
            right--;
        }

        System.out.println("The string is palindrome: " + true);
    }
}
