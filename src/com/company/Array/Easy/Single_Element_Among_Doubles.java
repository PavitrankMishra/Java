package com.company.Array.Easy;

import java.util.HashSet;

public class Single_Element_Among_Doubles {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,4,5,3,4};
        HashSet<Integer> hs = new HashSet<Integer>();

        boolean flag = true;
        int value = -1;
        for(int i=0;i<arr.length;i++) {
            if(hs.contains(arr[i])) {
                flag = false;
                value = arr[i];
                System.out.println("The double element is: " + value);
                return;
            }else {
                hs.add(arr[i]);
            }
        }


    }
}
