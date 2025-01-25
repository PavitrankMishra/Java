package com.company.Hashing;

import java.util.*;
public class Intersection_Two_Arrays {
    public static void main(String[] args) {
        int[] a = new int [] {1,2,1,3,1};
        int [] b = new int [] {3,1,3,4,1};

        List<Integer> l1 = new ArrayList<Integer>();

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num:a) {
            hs.add(num);
        }

        for(int num:b) {
            if(hs.contains(num)) {
                l1.add(num);
                hs.remove(num);
            }
        }

        System.out.println("The common elements are: " + l1.size());
    }
}
