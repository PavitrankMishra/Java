package com.company.Hashing;

import java.util.*;
public class Union_Two_Arrays {
    public static void main(String[] args) {
        int[] a = new int [] {1,2,3,2,1};
        int[] b = new int [] {3,2,2,3,3,2};

        int i = 0;
        int j = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        while(i<a.length || j<b.length) {
            if(i<a.length) {
                hs.add(a[i]);
            }

            if(j<b.length) {
                hs.add(b[i]);
            }

            i++;
            j++;
        }
        System.out.println(hs);
    }
}
