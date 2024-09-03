package com.company.Z_AC;

//Convert Decimal to binary
public class AC2 {
    public static String Binary(int n) {
        String res = "";

        while(n>0) {
            res += n%2;
            n/=2;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 10;
        String res = Binary(n);
        System.out.println(res);
    }
}
