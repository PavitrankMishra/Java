package com.company.Array;

public class Minimum_Increment_By_K_To_Make_All_Elements_Equal {
    public static void main(String[] args) {
        int[] arr = new int[] {4,7,19,16};
        int k = 3;

        int res = 0;

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        boolean flag = true;
        for(int j=0;j<arr.length;j++) {
            int val = (max-arr[j])%k;
            if(val != 0) {
                flag = false;
                return;
            } else {
                res += (max-arr[j])/k;
            }
        }

        System.out.println("The minimum operations required are: " + res);
    }
}
