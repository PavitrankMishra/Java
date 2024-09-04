package com.company.Z_AC;

//Make a single digit

public class AC16 {
    public static int single_digit(int n) {
        int originalN = n;
        int count_Digit = 0;
        int res = 0;
        while(n>0) {
            int digit = n%10;
            count_Digit++;
            n/=10;
        }

        if(count_Digit == 1) {
            res = originalN;
            return res;
        } else if(count_Digit > 1 && originalN % 2 == 0) {
            res = ((originalN-2)/2);
            return res;
        } else if(count_Digit > 1&& originalN % 2 != 0) {
            res = ((originalN/2));
            return res;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int n = 111;
        int res = single_digit(n);
        System.out.println(res);

    }
}
