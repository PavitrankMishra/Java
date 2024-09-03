package com.company.Z_AC;

//Sum of odd Integers
public class AC15 {
    public static int Sum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] %2 != 0) {
                sum += arr[i];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,5,7,10,12,11,9};
        int res = Sum(arr);
        System.out.println(res);
    }
}
