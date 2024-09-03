package com.company.Z_AC;

//Product of digits if N is odd
//Sum of digits if N is even
public class AC14 {
    public static void main(String[] args) {

        int n = 23;
        if(n%2 == 0) {
            int res = 0;
            while(n>0) {
                res += n%10;
                n /= 10;
            }
            System.out.println(res);
        } else {
            int res1 = 1;
            while(n>0) {
                res1 *= n%10;
                n /= 10;
            }
            System.out.println(res1);
        }
    }
}
