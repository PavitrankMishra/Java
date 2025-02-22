package com.company.Strings.Basic;

public class Concatenate_Strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        StringBuilder res = new StringBuilder();
        for(char c1:s1.toCharArray()) {
            res.append(c1);
        }

        for(char c2:s2.toCharArray()) {
            res.append(c2);
        }

        System.out.println(res);
    }
}
