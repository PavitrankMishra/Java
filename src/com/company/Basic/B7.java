package com.company.Basic;
import java.util.*;

//Anybase subtraction

public class B7 {
    public static int anybaseSubtraction(int n1, int n2, int b) {
        int rv = 0;
        int p = 1;
        int c = 0;

        while(n2>0) {
            int d1 = n1%10;
            int d2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;

            int d = 0;
            d2 = d2 + c;

            if(d2 >= d1) {
                c = 0;
                d = d2 - d1;
            } else {
                c = -1;
                d = d2 + b - d1;
            }

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
        System.out.println("Enter the current base");
        int b = sc.nextInt();
        int res = anybaseSubtraction(n1, n2, b);
        System.out.println(res);
    }
}
