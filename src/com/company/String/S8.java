package com.company.String;

import java.util.*;
import java.util.Map.Entry;
//Find Occurrence of each character in the string

public class S8 {
    public static void main(String[] args) {
        String str = "hello";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for(Entry<Character,Integer> mapEntry : map.entrySet()) {
            System.out.print(mapEntry.getKey() + ":" + mapEntry.getValue() + " ");
        }
    }
}
