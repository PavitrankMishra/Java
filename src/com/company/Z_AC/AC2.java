package com.company.Z_AC;

//Convert Decimal to binary
public class AC2 {
    public static String Binary(int n) {
        String ans = "";
        while(n > 0) {
            ans = ((n%2) == 0 ? "0" : "1") + ans;
            n = n/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        String res = Binary(n);
        System.out.println(res);
    }
}
