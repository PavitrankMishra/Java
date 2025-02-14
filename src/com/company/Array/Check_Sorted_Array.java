package com.company.Array;

public class Check_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = new int [] {20,21,45,89,89,90,47};

        int n = arr.length;
        if(n==0 || n == 1) {
            return;
        }

        for(int i=1;i<arr.length;i++) {
            if(arr[i] < arr[i-1]) {
                System.out.println("The array is not sorted");
                return;
            }
        }
    }
}
