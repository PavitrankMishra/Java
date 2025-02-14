package com.company.Array;

public class Zeros_To_End {
    public static void main(String[] args) {
        int[] arr = new int [] {1,2,0,4,3,0,5,0};

        int n = arr.length-1;
        int idx = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                arr[idx++] = arr[i];
            } else {
                count++;
            }
        }

        for(int j = idx;j<n;j++) {
            arr[j] = 0;
        }
        System.out.println("The count is: " + count);

        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
}
