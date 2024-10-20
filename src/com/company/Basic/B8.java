package com.company.Basic;

import java.util.*;
//Any base multiplication

public class B8 {
    public static int getProduct(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        while(n2 > 0) {
            int d2 = n2%10;
            n2 = n2/10;
            int sprd = getMultiplyWithADigit(b,n1,n2);
            rv = getSum(b,rv,sprd*p);
            p=p*10;
        }
        return rv;
    }

    public static int getMultiplyWithADigit(int b, int n1, int d1) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n1 > 0) {
            int rem1 = n1%10;
            n1 /= 10;
            int d = rem1*d1 + c;
            c = d/b;
            d = d%b;
            rv += d*p;
            p = p*10;
        }

        return rv;
    }

    public static int getSum(int b, int n1 , int n2) {
        int rv = 0;
        int c = 0;
        int p = 1;

        while(n1 > 0 || n2 > 0 || c > 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 %10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = rem1 + rem2 + c;
            c = d/b;
            d = d%b;

            rv += d*p;
            p = p*10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        System.out.println("Enter the number for the base");
        int b = sc.nextInt();
        int res = getSum(b,n1,n2);
        System.out.println(res);
        int res2 = getMultiplyWithADigit(b, n1, 4);
        System.out.println(res2);

        int res3 = getProduct(b,n1,n2);
        System.out.println(res3);
    }
}
