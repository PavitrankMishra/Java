package com.company.Strings;

public class Strings_Are_Rotations_Each_Other {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";


        for(int i=0;i<s1.length();i++){
            if(s1.equals(s2)) {
                return;
            }

            char last = s1.charAt(s1.length()-1);
            s1 = last + s1.substring(0,s1.length()-1);

            System.out.println(s1);
        }
    }
}
