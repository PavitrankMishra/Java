package com.company.Practice;

import java.util.HashMap;
import java.util.Map;

public class P7 {
    public static void main(String[] args) {
        int[] arr = new int [] {7,2,1,2,3,3,4,7,1};

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++) {
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }

        int minElement = Integer.MAX_VALUE;
        int max_Count = 0;
        for(HashMap.Entry<Integer,Integer> entry:hm.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            if(count > max_Count || (count == max_Count && key < minElement)) {
                max_Count = count;
                minElement = key;
            }
        }

        System.out.println("Element frequency count: ");
        for(Map.Entry<Integer, Integer> entry:hm.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        System.out.println("Smallest element with max frequency: " + minElement + ". The count is: " + max_Count);
    }
}
