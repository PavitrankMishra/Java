package com.company.Hashing;

import java.util.*;
public class Count_Pair_With_Given_Sum {
    public static void main(String[] args) {
        int [] arr = new int [] {1,5,7,-1,5};
        int target = 6;
        HashSet<Integer> h1 = new HashSet<Integer>();

        int count = 0;

        for(int i=0;i<arr.length;i++) {
            System.out.println(h1);
            int complement = target - arr[i];
            System.out.println(complement);
            if(h1.contains(complement)) {
                System.out.println("Found");
                count++;
            }
            h1.add(arr[i]);
        }

        System.out.println("The count of the pairs is: " + count);
    }
}
