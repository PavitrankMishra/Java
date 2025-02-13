package com.company.Hashing.Medium;

import java.util.*;
public class Medium_Triplets_With_Zero_Sum {
    public static void main(String[] args) {
        int[] arr = new int[] {0,-1,2,-3,1};
        int target = 0;

        int count = 0;

        for(int i=0;i<arr.length-1;i++) {
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int j=i+1;j<arr.length;j++) {
                int required = (target - (arr[i] + arr[j]));

                if(hs.contains(required)) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ", " + required + " ");
                    count++;
                }

                hs.add(arr[j]);
            }
        }

        System.out.println("The number of triplet pairs with zero sum is: " + count);
    }
}
