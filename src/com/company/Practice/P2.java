package com.company.Practice;

public class P2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,2,2,2,4,4};

        if(arr.length < 0) {
            return;
        }

        int index = 0;
        for(int i=1;i<arr.length;i++) {
            if(arr[index] != arr[i]) {
                index++;
                arr[index] = arr[i];
            }
        }
        index++;


        for(int num:arr) {
            System.out.print(num + " ");
        }
        System.out.println("The value of count is: " + index);
    }
}
