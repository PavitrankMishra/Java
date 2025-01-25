package com.company.Hashing;

import java.util.*;
public class Most_Frequent_Element_In_Array {
    public static void main(String[] args) {
        int[] arr = new int [] {40,50,30,40,50,30,30};

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++) {
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }

        int max_Count = 0;
        int result = -1;
        for(Map.Entry<Integer,Integer> val:hm.entrySet()) {
            if(max_Count < val.getValue()) {
                result = val.getKey();
                max_Count = val.getValue();
            }
        }
        System.out.println(hm);

        System.out.println("The maximum frequency is: " + max_Count);
        System.out.println("The maximum frequency key is: " + result);
    }
}
