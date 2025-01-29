package com.company.Hashing;

import java.util.*;
public class Duplicate_With_K_Distance {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,1,2,3,4};
        int k = 3;

        boolean flag = false;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++) {
            if(hm.containsKey(arr[i])) {
                int distance = i - hm.get(arr[i]);
                if(distance == k ) {
                    flag = true;
                    System.out.println("The repeated value is: " + arr[i]);
                    break;
                }
            } else {
                hm.put(arr[i], i);
            }
        }

        System.out.println("Does the value with distance k exist ? " + flag);
    }
}
