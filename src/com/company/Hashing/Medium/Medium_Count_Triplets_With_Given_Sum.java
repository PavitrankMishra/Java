package com.company.Hashing.Medium;

import java.util.HashSet;

public class Medium_Count_Triplets_With_Given_Sum {
    public static void main(String[] args) {
        int[] arr = new int [] {0,-1,2,-3,1};
        int target = -2;

        int count = 0;
        for(int i=0;i<arr.length-1;i++) {
            HashSet<Integer> hs = new HashSet<Integer>();
            System.out.println(i);
            for(int j=i+1;j<arr.length;j++) {
                System.out.println(arr[i] + " " + arr[j]);
                int required = target - (arr[i] + arr[j]);
                if(hs.contains(required)) {
                    System.out.println("Triplet found: (" + arr[i] + ", " + arr[j] + ", " + required + ")");
                    count++;
                }
                hs.add(arr[j]);
            }
        }

        System.out.println("The number of triplet pairs possible are: " + count);
    }
}