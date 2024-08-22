package com.company.Z_AC;

//Googly Prime - A number whose sum of the digits is a prime number
public class AC3 {
    public static boolean googly_Prime(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n/=10;
        }
        if(sum % 2 != 0 && sum != 2) {
            System.out.println("The sum of the digits is: " + sum);
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 43;
        boolean res = googly_Prime(n);
        System.out.println(res);
    }
}
