package com.company.Sorting;

public class Prefix_Sum_Array {
    public static void main(String[] args) {
        int[] arr = new int[] {10,20,10,5,15};

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        int preSum = arr[0];
        for(int i=1;i<arr.length;i++) {
            preSum += arr[i];
            prefix[i] = preSum;
        }

        for(int num: prefix) {
            System.out.print(num + " ");
        }
    }
}
