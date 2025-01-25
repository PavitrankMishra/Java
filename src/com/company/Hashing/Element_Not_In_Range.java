package com.company.Hashing;

import java.util.*;
public class Element_Not_In_Range {
    public static void main(String[] args) {
        int[] arr = new int [] {1,2,3,2,4};
        int n = 5;

        int res = -1;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num:arr) {
            if(hs.contains(num)) {
                res = num;
                break;
            }
            hs.add(num);
        }


        System.out.println("The element that is repeating is: " + res);
    }
}
