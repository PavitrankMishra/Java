package com.company.Searching;

public class Linear_Search {
    public static void main(String[] args) {
//        Linear Search - Algorithm that helps to iterate through collection one element at a time
//        runTime Complexity: O(n)

//        Advantages: Fast for small or medium size data sets
//                    Does not need to be sorted
//                    Useful for data structures that do not have random access

//        Disadvantages: Slow for larger data set
        int [] array = {9,1,8,2,7,4,5,3,6};

        int index = linear_Search(array, 5);
        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int linear_Search(int[] array, int val) {
        for( int i=0;i<array.length;i++) {
            if(array[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
