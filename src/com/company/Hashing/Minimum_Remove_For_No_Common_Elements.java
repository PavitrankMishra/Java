package com.company.Hashing;

import java.util.*;
public class Minimum_Remove_For_No_Common_Elements {
    public static void main(String[] args) {
        int[] arr1 = new int [] {1, 2, 3, 4};
        int[] arr2 = { 2, 3, 4, 5, 8 };

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num:arr1) {
            hs.add(num);
        }

        int count = 0;
        for(int num:arr2) {
            if(hs.contains(num)) {
                count++;
            }
        }

        System.out.println("The number of elements to remove is: " + count);
    }
}
