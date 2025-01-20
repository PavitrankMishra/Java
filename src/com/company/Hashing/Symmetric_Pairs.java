package com.company.Hashing;

import java.util.HashMap;
public class Symmetric_Pairs {
    public static void main(String[] args) {
        int [][] arr = {{11,20}, {30,40}, {5,10}, {40,30}, {10,5}};

        HashMap<Integer,Integer> m1 = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            if(m1.containsKey(second) && m1.get(second) == first) {
                System.out.println("Pair found: (" + second + ", " + first + ")");
            } else {
                m1.put(first,second);
            }
        }
    }
}
