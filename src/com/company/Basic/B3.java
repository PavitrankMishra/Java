package com.company.Basic;
import java.util.*;

//Convert the number from decimal to any base

public class B3 {
    public static int getValueInAnyBase(int n, int b1, int b2) {
        int rv = 0;
        int p = 1;
        while(n>0) {
            int rem = n%b2;
            rv = rv + rem*p;
            n = n/b2;
            p = p*b1;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be converted");
        int n = sc.nextInt();
        System.out.println("Enter the current base of the number");
        int b1 = sc.nextInt();
        System.out.println("Enter the base to be converted into");
        int b2 = sc.nextInt();
        int res = getValueInAnyBase(n,b1, b2);
        System.out.println(res);
    }
}
