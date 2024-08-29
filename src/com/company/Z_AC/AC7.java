package com.company.Z_AC;

public class AC7 {
    public static String suffix(String[] s1, String w) {
        String ans = "";
        int MSL = 0;

        for(String a:s1) {
            int currentSuffixLength = LongestCommonSuffix(a, w);
            if(currentSuffixLength>MSL || currentSuffixLength == MSL && w.length() < ans.length()) {
                ans = w;
                MSL = currentSuffixLength;
            }
        }
        return ans;
    }

    public static int LongestCommonSuffix(String s2, String s3) {
        int count = 0;
        int i = s2.length()-1;
        int j = s3.length()-1;

        while(i>=0 && j>=0 && s2.charAt(i) == s3.charAt(j)) {
            count++;
            i--;
            j--;
        }

        return count;
    }
    public static void main(String[] args) {
     String[] s1 = new String [] {"Gender", "Blender", "Blunder", "under", "Thunder"};
     String word = "Under";
     String res = suffix(s1, word);
     System.out.println(res);
    }
}
