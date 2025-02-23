package com.company.Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class Single_Among_Doubles {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int[] arr = new int[] {2,3,5,4,5,3,4};
        for(int i=0;i<arr.length;i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> set: hm.entrySet()) {
            if(set.getValue() == 1) {
                System.out.println(set.getKey());
                return;
            }
        }
    }
}
