package com.company.Array;

public class Minimum_Cost_To_Make_Array_Size_1 {
    public static void main(String[] args) {
        int[] arr = new int [] {4,3,2};
        int n = arr.length;

        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int val = (n-1)*min;
        System.out.println("The minimum cost is: " + val);
    }
}
