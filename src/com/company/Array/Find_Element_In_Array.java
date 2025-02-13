package com.company.Array;

public class Find_Element_In_Array {
    public static void main(String[] args) {
        int[] arr = new int [] {1,2,3,4};
        int x = 3;

        boolean flag = false;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
                flag = true;
            }
        }

        System.out.println("Element found " + flag);
    }
}
