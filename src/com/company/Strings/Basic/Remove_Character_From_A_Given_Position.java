package com.company.Strings.Basic;

public class Remove_Character_From_A_Given_Position {
    public static void main(String[] args) {
        String s = "abcde";
        int pos = 1;

        StringBuilder res = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            if(i!=pos) {
                res.append(s.charAt(i));
            }
        }

        System.out.println(res);
    }
}
