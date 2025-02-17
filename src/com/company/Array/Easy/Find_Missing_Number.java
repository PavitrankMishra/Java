package com.company.Array.Easy;

import java.util.HashSet;

public class Find_Missing_Number {
    public static void main(String[] args) {
//        int[] arr = new int[] {1,2,4,6,3,7,8};
//        int n = arr.length;
//
//        int[] hash = new int[n+2];
//
//        for(int i=0;i<arr.length;i++) {
//            hash[arr[i]]++;
//        }
//
//        for(int num:hash) {
//            System.out.print(num + " ");
//        }
//        for(int j=1;j<=n;j++) {
//            if(hash[j] == 0) {
//                System.out.println("The value is: " + j);
//                return;
//            }
//        }

//        Second approach


        int[] arr1 = new int[] {1,2,3,5};
        int n2 = arr1.length;
        int res = find_Result(arr1, n2);
        System.out.println("The value is: " + res);
    }

    private static int find_Result(int[] arr1, int n2) {
        int sum = 0;
        for(int i=0;i<arr1.length;i++) {
            sum += arr1[i];
        }

        int expectedSum = (n2*(n2+1))/2;
        return expectedSum - sum;
    }
}
