package com.company.Array;

public class Largest_Element_Array {
    public static void main(String[] args) {
        int[] arr = new int [] {10,20,4};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum value is: " + max);
    }
}
