package com.company.Array.Easy;

public class Prefix_Sum {
    public static void main(String[] args) {
        int[] arr = new int[] {10,4,16,20};

        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        int preSum = 0;
        for(int i=1;i<n;i++) {
            preSum += arr[i-1];
            prefixSum[i] = preSum;
        }

        for(int num:prefixSum) {
            System.out.print(num + " ");
        }
    }
}
