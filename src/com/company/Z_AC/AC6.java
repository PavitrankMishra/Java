package com.company.Z_AC;

//Equilibrium_Point

public class AC6 {
    public static int Equilibrium_Point(int[] num1) {
        int n = num1.length;
        int[] pre = new int[n];
        int[] suf = new int[n];


        pre[0] = num1[0];
        for(int i = 1; i < n; i++) {
            pre[i] = num1[i] + pre[i-1];
        }


        suf[n-1] = num1[n-1];
        for(int i = n-2; i >= 0; i--) {
            suf[i] = num1[i] + suf[i+1];
        }


        for(int i = 0; i < n; i++) {
            if (pre[i] == suf[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-7, 1, 5, 2, -4, 3, 0};
        int res = Equilibrium_Point(arr);
        System.out.println(res);
    }
}
