package com.company.Strings;

import java.util.*;
public class Check_Anagrams {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";

        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0;i<s1.length();i++) {
            hs.add(s1.charAt(i));
        }

        boolean flag = true;
        for(int j=0;j<s2.length();j++) {
            if(!hs.contains(s2.charAt(j))) {
                flag = false;
            }
        }

        System.out.println("Are the two strings anagram ? " + flag);
    }
}
