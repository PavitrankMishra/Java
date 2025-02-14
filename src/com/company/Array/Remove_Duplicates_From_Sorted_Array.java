package com.company.Array;

import java.util.ArrayList;
import java.util.HashSet;

public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = new int [] {1,2,2,3,4,4,4,5,5};

        int idx = 1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i] != arr[i-1]) {
                arr[idx++] = arr[i];
            }
        }

        for(int i=0;i<idx;i++) {
            System.out.print(arr[i] + " ");
        }
//        ArrayList<Integer> al = new ArrayList<Integer>();
//
//        al.add(arr[0]);
//        for(int i=1;i<arr.length;i++) {
//            if(arr[i] != arr[i-1]) {
//                al.add(arr[i]);
//            } else {
//                continue;
//            }
//        }
//
//        System.out.println(al);


//        HashSet<Integer> hs = new HashSet<Integer>();
//        for(int i=0;i<arr.length;i++) {
//            hs.add(arr[i]);
//        }
//
//        System.out.println(hs);
    }
}
