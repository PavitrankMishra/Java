package com.company.Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = new int [] {64,25,12,22,11};

        int n = arr.length;

        for(int i=0;i<arr.length;i++) {
            int min_Idx = i;

            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]< arr[min_Idx]) {
                    min_Idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_Idx];
            arr[min_Idx] = temp;
            System.out.println(min_Idx);
        }

        for(int num:arr) {
            System.out.println(num + " ");
        }
    }
}
