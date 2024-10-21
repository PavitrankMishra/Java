package com.company.String;

import java.util.*;
//Remove all the Duplicate Characters

public class S4 {
    public static void main(String[] args) {
        String str = "programming";
        LinkedHashSet<Character> h1 = new LinkedHashSet<Character>();
        for(int i=0;i<str.length();i++) {
            h1.add(str.charAt(i));
        }

        StringBuilder str2 = new StringBuilder();
        for(char ch:h1) {
            str2.append(ch);
        }
        System.out.println(str2);
    }
}
