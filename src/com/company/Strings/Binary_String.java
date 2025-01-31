package com.company.Strings;

public class Binary_String {
    public static void main(String[] args) {
        String s = "0101010101";

        boolean flag = true;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != '0' && s.charAt(i) != '1') {
                flag = false;
            }
        }

        System.out.println("Is the string a valid binary string: " + flag);
    }
}
