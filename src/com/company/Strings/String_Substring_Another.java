package com.company.Strings;

public class String_Substring_Another {
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "eks";

//        int flag = -1;
//        int end = 3;
//        for(int i=0;i<txt.length()-3;i++) {
//            System.out.println(txt.substring(i, end));
//            if((txt.substring(i, end)).equals(pat)) {
//                flag = 1;
//                System.out.println(end);
//                break;
//            }
//            System.out.println("The value of end is: " + end);
//            end++;
//        }
//
//        System.out.println("Is the string found in txt ?: " + flag);

        int n = txt.length();
        int m = pat.length();

        for(int i=0;i<=n-m;i++) {
            int j;
            for(j=0;j<m;j++) {
                if(txt.charAt(i+j) != pat.charAt(j)) {
                    break;
                }
            }

            if(j == m) {
                System.out.println(i);
            }
        }
    }
}
