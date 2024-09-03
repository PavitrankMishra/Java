package com.company.Z_AC;

//Inversion Pair - The pair in which the left element is greater than the right

public class AC18 {
    public static int Count_Pair(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,20,6,4,5};
        int res = Count_Pair(arr);
        System.out.println(res);
    }
}
