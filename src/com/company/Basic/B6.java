package com.company.Basic;

//Any base addition

import java.util.*;
public class B6 {
    public static int addthenumber(int n1, int n2, int b) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n2 > 0 || n1 > 0 || c > 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;

            n1 = n1/10;
            n2 = n2/10;

            int d = rem1 + rem2 + c;
            c = d/b;
            d = d%b;

            rv += d*p;
            p=p*10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for the base");
        int b = sc.nextInt();

        System.out.println("Enter the first number");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number");
        int n2 = sc.nextInt();

        int res = addthenumber(n1,n2,b);
        System.out.println(res);
    }
}
