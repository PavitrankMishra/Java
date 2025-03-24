package com.company.Practice;

public class P3 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr = new int [] {2,0,1,2,1,1,0,2,0};
        int n = arr.length;
        int start = 0;
        int mid = 0;
        int end = n-1;

        while(mid<=end) {
            if(arr[mid] == 0) {
                swap(arr, start, mid);
                start++;
                mid++;
            } else if(arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, end);
                end--;
            }
        }

        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
}
