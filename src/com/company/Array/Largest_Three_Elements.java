package com.company.Array;

public class Largest_Three_Elements {
    public static void main(String[] args) {
        int [] arr = new int [] {10,4,3,50,23,90};

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++) {
            if(i==1) {
                if(arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                } else if(arr[i] > secondMax && arr[i] < max) {
                    secondMax = arr[i];
                }
            } else {
                if(arr[i] > max) {
                    thirdMax = secondMax;
                    secondMax = max;
                    max = arr[i];
                } else if(arr[i] > secondMax && arr[i] < max) {
                    thirdMax = secondMax;
                    secondMax = arr[i];
                }
            }
        }

        System.out.println("First Max: " + max);
        System.out.println("Second Max: " + secondMax);
        System.out.println("Third Max: " + thirdMax);
    }
}
