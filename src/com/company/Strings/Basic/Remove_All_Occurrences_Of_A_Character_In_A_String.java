package com.company.Strings.Basic;

public class Remove_All_Occurrences_Of_A_Character_In_A_String {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char c = 'e';

        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != c) {
                res.append(s.charAt(i));
            }
        }

        System.out.println(res);
    }
}
