package com.company.Z_AC;

//Googly Prime - A number whose sum of the digits is a prime number
public class AC3 {
    public static boolean googly_Prime(int n) {
        boolean res = true;
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n/=10;
        }

        for(int i=2;i<=Math.sqrt(sum);i++) {
            if(sum%i == 0){
                res = false;
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 44;
        boolean res = googly_Prime(n);
        System.out.println(res);
    }
}
