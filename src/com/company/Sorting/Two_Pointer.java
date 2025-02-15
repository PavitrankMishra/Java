package com.company.Sorting;

public class Two_Pointer {
    public static void main(String[] args) {
        int[] arr = new int[] {10,20,35,50};

        int target = 70;
        for(int i=0;i<arr.length;i++) {

            for(int j=i+1;j<arr.length;j++) {
                int sum = arr[i] + arr[j];
                if(sum == target) {
                    System.out.println("Pair Exist ");
                    return;
                }
            }
        }
    }
}
