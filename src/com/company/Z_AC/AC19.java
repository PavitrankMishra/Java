package com.company.Z_AC;

//Find sum of array  elements at even position after returning the array
//No need to reverse the array because after reversing the array even elements are at even position ad odd elements are at odd position.
//Also we can calculate the Ridx that will be the reverse index from the right.
public class AC19 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int [] {1,2,3,4,1,2,0,1,2,3};
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            int ridx = n-i-1;
            if(ridx%2 == 0) {
                sum += arr[ridx];
            }
        }
        System.out.println("The sum at even index is: " + sum);
    }
}
