package com.company.Practice;

public class P4 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,9,6,3,2,8,9,10};

        int max = -1;
        int counter = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
                counter++;
            }
        }

        System.out.println("The value of counter is: " + counter);
    }
}
