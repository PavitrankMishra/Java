package com.company.Array;

public class Running_Sum {
    public static void main(String[] args) {
        int[] nums = new int []{1,2,3,4};
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        System.out.println(sum);

        for(int i = 0;i<nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
