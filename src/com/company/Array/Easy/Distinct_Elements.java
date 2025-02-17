package com.company.Array.Easy;

import java.util.HashSet;

public class Distinct_Elements {
    public static void main(String[] args) {
        int[] arr = new int[] {12,10,9,45,2,10,10,45};

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++) {
            hs.add(arr[i]);
        }

        System.out.println(hs);
    }
}
