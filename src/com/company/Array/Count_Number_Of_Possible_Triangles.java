package com.company.Array;

public class Count_Number_Of_Possible_Triangles {
    public static void main(String[] args) {
        int[] arr = new int [] {4,6,3,7};
        for(int i = 0;i<arr.length;i++) {
            for(int j = i+1;j<arr.length;j++) {
                for(int k = i+2;i<arr.length;i++) {
                    System.out.print(arr[i] + "" + arr[j] + "" + arr[k]);
                }
            }
        }
        System.out.println();
    }
}
