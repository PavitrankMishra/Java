package com.company.Hashing;

import java.util.*;
public class Missing_Element_Of_Range {
    public static void main(String[] args) {
        int[] arr = new int[] {10,12,11,15};
        int low = 10;
        int high = 15;

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num:arr) {
            hs.add(num);
        }

        while(low<=high) {
            if(!hs.contains(low)) {
                System.out.println(low);
            }
            low++;
        }

    }
}
