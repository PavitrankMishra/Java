package com.company.Hashing.Medium;

public class Longest_Subarray_With_Sum_Divisble_By_K {
    public static void main(String[] args) {
        int[] arr = new int [] {2,7,6,1,4,5};
        int k = 3;


        int res = 0;
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            int sum1 = 0;
            for(int j=i;j<arr.length;j++) {
                sum1 = sum + arr[j];
                sum = (sum + arr[j])%k;
                System.out.print(arr[j]);
                if(sum == 0) {
                    res = Math.max(res, j - i + 1);
                }
//                System.out.println();
            }
            System.out.println();
        }

        System.out.println("The maximum length is: " + res);
    }
}
