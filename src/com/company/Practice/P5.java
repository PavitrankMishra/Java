package com.company.Practice;

import java.util.HashSet;

public class P5 {
    public static void main(String[] args) {
        int[] arr = new int [] {1,4,2,1,4,3,6,7,8,6};
        HashSet<Integer> set1 = new HashSet<Integer>();

        int n = arr.length;
        for(int i=0;i<n;i++) {
            if(!set1.contains(arr[i])) {
                System.out.print(arr[i]);
            }
            set1.add(arr[i]);
        }

        System.out.println(set1);
    }
}
