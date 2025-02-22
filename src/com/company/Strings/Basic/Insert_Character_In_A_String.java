package com.company.Strings.Basic;

public class Insert_Character_In_A_String {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        String s = "Geeks";
        char c = 'A';
        int pos = 3;

        for(int i=0;i<s.length();i++) {
            if(i == pos) {
                res.append(c);
            }
            res.append(s.charAt(i));
        }

        System.out.println(res);
    }
}
