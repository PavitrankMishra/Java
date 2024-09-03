package com.company.Z_AC;

public class AC9 {
    public static String remove_occurrence(char ch1, char ch2, String s1) {
        StringBuilder res = new StringBuilder(s1);
        for(int i=0;i<s1.length();i++) {
            if(res.charAt(i) == ch1) {
                res.setCharAt(i, ch2);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        char ch1 = 's';
        char ch2 = 'a';
        String s1 = "shaurya";
        String res = remove_occurrence(ch1, ch2, s1);
        System.out.println(res);
    }
}
