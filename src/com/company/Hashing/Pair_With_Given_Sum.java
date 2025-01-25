package com.company.Hashing;

import java.util.*;
public class Pair_With_Given_Sum {
    public static void main(String[] args) {
        int[] arr = new int []{0, -1, 2, -3, 1};
        int target = -2;

        HashSet<Integer> hs = new HashSet<Integer>();

        boolean flag = false;
        for(int i=0;i<arr.length;i++) {
            int complement = target - arr[i];

            if(hs.contains(complement)) {
                flag = true;
                break;
            }
            hs.add(arr[i]);
        }

        System.out.println("Does the pair with given target exist ? " + flag);
    }
}
