package com.company.Basic;
import java.util.*;

//Any base to decimal

public class B4 {
    public static int getInBase(int n, int b1, int b2) {
        int rv = 0;
        int p = 1;
        while(n>0) {
            int rem = n%b2;
            rv += rem*p;
            n= n/b2;
            p = p*b1;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for number");
        int n1 = sc.nextInt();
        System.out.println("Enter the value for base");
        int b1 = sc.nextInt();
        System.out.println("Enter the value for converting to a new base");
        int b2 = sc.nextInt();
        int res = getInBase(n1,b1,b2);
        System.out.println(res);
    }
}
