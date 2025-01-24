package com.company.Hashing;
import java.util.*;

public class Array_Subset_Another_Array {
    public static void main(String[] args) {
//        Check if array b is a subset of array a
        int[] a = new int [] {11, 1, 13, 21, 3, 7};
        int[] b = new int [] {11, 3, 7, 1};

        HashSet<Integer> hs = new HashSet<Integer>();

        boolean flag = true;
        for(int num:a) {
            hs.add(num);
        }

        for(int num:b) {
            if(!hs.contains(num)) {
                flag = false;
                break;
            }
        }

        System.out.println("Is set B the subset of A ?" + flag);
    }
}
