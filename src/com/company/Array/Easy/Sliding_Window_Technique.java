package com.company.Array.Easy;

public class Sliding_Window_Technique {
    public static void main(String[] args) {
        int[] arr = new int[] {100,200,300,400};
        int k = 2;

        int max_Sum = 0;
        for(int i=0;i<k;i++) {
            max_Sum += arr[i];
        }

        int windowSum = max_Sum;
        for(int i=k;i<arr.length;i++) {
            windowSum += arr[i] - arr[i-k];
            max_Sum = Math.max(windowSum, max_Sum);
        }

        System.out.println(max_Sum);
    }
}
