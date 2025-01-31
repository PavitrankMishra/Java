package com.company.Strings;

public class Count_Substring_That_Start_And_Ends_With_1 {
    public static void main(String[] args) {
        String s = "00100101";
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<=s.length();j++) {
//                System.out.println(s.substring(i,j));
                String res = s.substring(i,j);
                if(res.charAt(res.length()-1) == '1' && res.charAt(0) == '1' && res.length() > 1) {
                    System.out.println(res);
                }
            }
        }
    }
}
