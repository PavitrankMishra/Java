package com.company.Array;

public class Concat_Array {
    public static void main(String[] args) {
        int[] nums = new int []{1,2,1};
        int[] ans = new int [nums.length*2];
        int n = nums.length;

        for(int i=0;i<nums.length;i++) {
            ans[i] = ans[i+n] = nums[i];
        }

        for(int n1:ans) {
            System.out.println(n1);
        }
    }
}
