package com.company.Array;

public class Print_Subarrays_Size_K {
    public static void main(String[] args) {
        int[] arr = new int [] {100,200,300,400};
        int k = 2;
        int n = arr.length;
//        Optimised approach
        int maxSum = 0;
        int start = 0;
        int sum = 0;
        while(start < k && start < n) {
            sum += arr[start];
            start++;
        }

        maxSum = sum;
        for(int i=1;i<n-k+1;i++) {
            int prevElement = arr[i-1];
            int nextElement = arr[i+k-1];
            sum = sum - prevElement + nextElement;
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("The maximum sum is: " + maxSum);
//        for(int i=0;i<n-k+1;i++) {
//            int sum = 0;
//            for(int j= i;j<=i+k-1;j++) {
//                sum += arr[j];
//                System.out.print(arr[j] + " ");
//            }
//            System.out.println("The sum of the pairs is: " + sum);
//            maxSum = Math.max(maxSum, sum);
//        }
//
//        System.out.println("The maxsum is: " + maxSum);
    }
}
