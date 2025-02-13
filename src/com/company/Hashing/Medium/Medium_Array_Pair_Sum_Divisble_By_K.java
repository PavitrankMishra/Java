package com.company.Hashing.Medium;

import java.util.*;
public class Medium_Array_Pair_Sum_Divisble_By_K {
    public static void main(String[] args) {
        int[] arr = new int [] {91, 74, 66, 48};
        int k = 10;

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num:arr) {
            hs.add(num);
        }

        int n = arr.length;
        if(n%2 == 1) {
            return;
        }

        boolean flag = true;
        for(int i=0;i<n/2;i++) {
            int num = k - (arr[i]%k);

            if(!hs.contains(num)) {
                flag = false;
//                return;
            }
        }

        System.out.println(hs);
        System.out.println("Can the array be divided in valid pair ? " + flag);
    }
}
