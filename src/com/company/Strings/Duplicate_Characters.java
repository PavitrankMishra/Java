package com.company.Strings;

import java.util.*;
public class Duplicate_Characters {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++) {
            if(!hs.containsKey(s.charAt(i))) {
                hs.put(s.charAt(i), 1);
            } else {
                hs.put(s.charAt(i), hs.get(s.charAt(i)) + 1);
            }
        }

        for(Map.Entry<Character,Integer> mapEl:hs.entrySet()) {
            if(mapEl.getValue()>1) {
                System.out.println(mapEl.getKey() + " count = " + mapEl.getValue());
            }
        }
    }
}
