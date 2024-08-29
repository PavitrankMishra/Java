package com.company.Z_AC;

//Count_Max_A (Sliding Window)

public class AC5 {
    public static int Count_Max_A(String s, int k) {
        int n = s.length();
        int count = 0;
        int maxi = 0;
        int i = 0;
        int j = -1;

        while(j<k-1) {
            char curr_Char = s.charAt(++j);
            if(curr_Char == 'a') count++;
        }
        maxi = count;

        while(j<n-1) {
            if(s.charAt(i++) == 'a') count--;
            if(s.charAt(++j) == 'a') count++;
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }
    public static void main(String[] args) {
        String s1 = "aabaaa";
        int res = Count_Max_A(s1, 3);
        System.out.println("The maximum number of occurrence of a is: " + res);
    }
}
