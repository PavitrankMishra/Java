package com.company.Array.Easy;

public class Print_All_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};

        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                int sum = 0;
                for(int k=i;k<=j;k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print(sum + " ");
                System.out.println();

            }
            System.out.println();
        }
    }
}
