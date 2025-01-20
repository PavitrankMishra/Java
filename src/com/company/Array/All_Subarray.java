package com.company.Array;

public class All_Subarray {
    public static void main(String[] args) {
//        Finding all the subarrays
        int[] arr = new int [] {0,1,2,3,4};
        int n = arr.length;

        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
