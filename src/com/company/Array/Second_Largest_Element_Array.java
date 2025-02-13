package com.company.Array;

public class Second_Largest_Element_Array {
    public static void main(String[] args) {
        int[] arr = new int [] {12,35,1,10,34,1};

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }

        System.out.println("The second maximum value is: " + secondMax);
        System.out.println("The maximum value is: " + max);
    }
}
