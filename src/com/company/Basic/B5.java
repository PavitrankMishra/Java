package com.company.Basic;
import java.util.*;

//Convert the number from anybase to any base
public class B5 {
    public static int anybaseTodecimal(int n1, int b1) {
        int rv = 0;
        int p = 1;
        while(n1>0) {
            int rem = n1%10;
            rv += rem*p;
            n1/=10;
            p=p*b1;
        }
        return rv;
    }

    public static int decimalToAnybase(int n1,int b2) {
        int rv = 0;
        int p = 1;
        while(n1>0) {
            int rem = n1%b2;
            rv += rem*p;

            n1/=b2;
            p=p*10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the number");
        int n1 = sc.nextInt();
        System.out.println("Enter the value of the current base");
        int b1 = sc.nextInt();
        System.out.println("Enter the value of the base for converted number");
        int b2 = sc.nextInt();
        int res = anybaseTodecimal(n1,b1);
        System.out.println(res);

        int res2 = decimalToAnybase(res, b2);
        System.out.println(res2);
    }
}
