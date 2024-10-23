package com.company.String;
import java.util.*;

// Check whether two strings are anagram

public class S10 {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "baab";
        boolean isAnagram = true;

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        for(char ch:s1Array) {
            if(map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }
        System.out.println(map1);

        for(char ch2:s2.toCharArray()) {
            if(!map1.containsKey(ch2) || map1.get(ch2) == 0) {
                isAnagram = false;
                break;
            } else {
                map1.put(ch2, map1.get(ch2) - 1);
            }
        }

        for(int count:map1.values()) {
            if(count != 0) {
                isAnagram = false;
                break;
            }
        }

        if(isAnagram) {
            System.out.println("The string is an anagram");
        } else {
            System.out.println("The string is not an anagram");
        }
    }
}
