package com.company.Practice;

public class P1 {
    public static void main(String[] args) {
        int[] arr = new int [] {4,5,0,1,9,0,5,0};

        int counter = 0;
        int idx = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                arr[idx++] = arr[i];
            } else {
                counter++;
            }
        }

        for(int j=idx;j<arr.length;j++) {
            arr[j] = 0;
        }

        for(int num:arr) {
            System.out.print(num + " ");
        }

//        System.out.println(counter);
    }
}
