package com.company.Practice;

public class P6 {
    public static void main(String[] args) {
        int n = 4;
        int ways = 1;
        int remways = 2;
        int i=1;
        while(i<=n-1) {
            remways *= i;
            i++;
        }


        System.out.println(remways * ways);
    }
}
