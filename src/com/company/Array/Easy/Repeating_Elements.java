package com.company.Array.Easy;

import java.util.HashSet;

public class Repeating_Elements {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int[] arr = new int[] {1,3,2,3,4};

        for(int i=0;i<arr.length;i++) {
            if(hs.contains(arr[i])) {
                int value = arr[i];
                System.out.println("The repeating value is: " + value);
                return;
            }
            hs.add(arr[i]);
        }
    }
}
