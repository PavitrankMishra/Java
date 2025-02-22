package com.company.Strings.Basic;

public class Insert_Character_In_A_String_At_Certain_Positions {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int[] chars = new int [] {1,5,7,9};

        int j = 0;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if(j<chars.length && i==chars[j]) {
                res.append("*");
                j++;
            }
            res.append(str.charAt(i));
        }

        System.out.println(res);
    }
}
