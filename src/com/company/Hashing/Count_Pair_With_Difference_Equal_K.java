package com.company.Hashing;

import java.util.*;
public class Count_Pair_With_Difference_Equal_K {
    public static void main(String[] args) {
        int[] arr = new int [] {1,4,1,4,5};
        int k = 3;

        int count = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++) {
            int complement = k + arr[i];
            System.out.println(complement);
            if(hs.contains(complement)) {
                count++;
            }

            hs.add(arr[i]);
        }

        System.out.println("The number of pairs with absolute difference equals to k are: " + count);
    }
}
