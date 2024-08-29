package com.company.Z_AC;

//Coding_Decoding

public class AC4 {
    public static String Coding_Decoding(String a) {
        String ans = "";
        int count = 0;

        for(int i=0;i<a.length();i++) {
            char currentChar = a.charAt(i);
            if(currentChar == '1') {
                count++;
            } else {
                ans += (char)('A' + count-1);
                count = 0;
            }
        }
        ans += (char) ('A' + count - 1);
        return ans;
    }
    public static void main(String[] args) {
        String a = "10111011";
        String res = Coding_Decoding(a);
        System.out.println(res);
    }
}
