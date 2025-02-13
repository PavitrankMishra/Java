package com.company.Array;

public class Alternate_Array_Print {
    public static void main(String[] args) {
        int[] arr = new int [] {10,20,30,40,50};

        for(int i=0;i<arr.length;i+=2) {
            System.out.println(arr[i]);
        }
    }
}
