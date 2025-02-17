package com.company.Array.Easy;

public class Segregate_0s_1s {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int n = arr.length;

        int count_One = 0;

        int idx = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] == 0) {
                arr[idx++] = 0;
            } else {
                count_One++;
            }
        }

        for(int j=idx;j<n;j++) {
            arr[j] = 1;
        }

        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
}
