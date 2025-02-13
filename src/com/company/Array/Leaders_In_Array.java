package com.company.Array;

import java.util.ArrayList;
import java.util.List;

public class Leaders_In_Array {
    public static void main(String[] args) {
        int[] arr = new int [] {16,17,4,3,5,2};

        List<Integer> l1 = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i] > max) {
                max = arr[i];
                l1.add(max);
            }
        }

        System.out.println(l1);
    }
}
