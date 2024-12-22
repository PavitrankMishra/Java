package com.company.Searching;

public class Binary_Search {
    public static void main(String[] args) {
//        Binary Search - Searching algorithm that helps to find the position of a target value within a sorted array. Half of the array is eliminated at each step.

        int[] arr = new int [] {1,2,3,4,5,6,7,8,9,10};
        int res = binary_Search(arr, 9);
        if(res != -1) {
            System.out.println("The element is found at index: " + res);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int binary_Search(int [] arr, int val) {
        int l = 0;
        int r = arr.length-1;

        while(l<=r) {
            int mid = l+(r-l)/2;
            if(arr[mid] == val) {
                return mid;
            } else if(arr[mid] < val) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
