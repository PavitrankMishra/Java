package com.company.Hashing;

import java.util.*;
public class Disjoint_Set {
    public static void main(String[] args) {
        int[] a = new int [] {12,34,11,9,3};
        int[] b = new int [] {2,1,5};

        HashSet<Integer> hs1 = new HashSet<Integer>();
        boolean flag = true;

//        Adding the elements to hashset
        for(int num:a) {
            hs1.add(num);
        }

        for(int num:b) {
            if(hs1.contains(num)) {
                flag = false;
                break;
            }
        }

        System.out.println("Does the disjoint set property satisfy ? " + flag);
    }
}
