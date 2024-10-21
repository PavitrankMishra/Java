package com.company.String;
import java.util.*;

//Find the length of the longest substring

public class S9 {
    public static void main(String[] args) {
        String str = "abbac";
        String longestSubstring = null;
        int longestSubstringLength = 0;

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }
        }

        System.out.println(map);
        if(map.size()> longestSubstringLength) {
            longestSubstringLength = map.size();
            longestSubstring = map.keySet().toString();
        }

        System.out.println(longestSubstring);
        System.out.println(longestSubstringLength);

    }
}
