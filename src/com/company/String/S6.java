package com.company.String;

//Replace character with Occurrence

public class S6 {
    public static void main(String[] args) {
        String input = "opentext";
        char charToReplace = 't';

        char[] str = input.toCharArray();
        int cnt = 1;
        for(int i=0;i<input.length();i++) {
            if(str[i] == charToReplace) {
                input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
                cnt++;
            }
        }
        System.out.println(input);
    }
}
