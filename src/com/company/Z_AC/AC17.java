package com.company.Z_AC;

//Superior Array Element - Find the number of elements that are greater then the number of elements in the right
public class AC17 {
    public static int superior_Element(int []arr) {
        int n = arr.length;
        int sup = Integer.MIN_VALUE;
        int count_Sup = 0;
        for(int i=n-1;i>=0;i--) {
            if(arr[i] > sup) {
                count_Sup++;
                sup = arr[i];
            }
        }
        return count_Sup;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {7,9,5,2,8,7};
        int res = superior_Element(arr);
        System.out.println(res);
    }
}
