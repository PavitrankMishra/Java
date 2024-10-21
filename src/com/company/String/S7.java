package com.company.String;

import java.util.*;
import java.util.Map.Entry;

//Program to find first non repeated characters

public class S7 {
    public static void main(String[] args) {
        String str = "AABCDBE";

//        Approach - 1
        for(int i=0;i<str.length();i++) {
            boolean unique = true;
            for(int j=0;j<str.length();j++) {
                if(i !=j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if(unique == true) {
                System.out.println("The first non repeated character is: " + str.charAt(i));
                break;
            }
        }

//        Approach - 2

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println(map);

        for(Entry<Character, Integer> entrySet: map.entrySet()) {
            if(entrySet.getValue() == 1) {
                System.out.println("The first non repeated character is: " + entrySet.getKey());
                break;
            }
        }
    }
}
