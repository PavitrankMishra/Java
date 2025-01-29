package com.company.Hashing;

import java.util.*;
public class Max_Distance_Two_Occurrences {
    public static void main(String[] args) {
        int[] arr = new int [] {1,1,2,2,2,1};
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();

        int maxDistance = -1;
        for(int i=0;i<arr.length;i++) {
            if(hm.containsKey(arr[i])) {
                int distance = i - hm.get(arr[i]);
                if(distance > maxDistance) {
                    maxDistance = distance;
                }
            } else {
                hm.put(arr[i], i);
            }
        }
        System.out.println("The maximum distance is: " + maxDistance);
    }
}
