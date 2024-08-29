package com.company.Z_AC;

public class AC9 {
    public static String remove_occurrence(char ch1, char ch2, String s1) {
        StringBuilder sb = new StringBuilder(s1);
        for(int i=0;i<s1.length();i++) {
            if(sb.charAt(i) == ch1) {
                sb.setCharAt(i, ch2);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        char ch1 = 's';
        char ch2 = 'a';
        String s1 = "shaurya";
        String res = remove_occurrence(ch1, ch2, s1);
        System.out.println(res);
    }
}
