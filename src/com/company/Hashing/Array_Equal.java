package com.company.Hashing;

import java.util.HashMap;

public class Array_Equal {
    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 2, 5, 2};
        int[] b = new int[]{2, 3, 5, 5, 2};

        // Creating a hashmap to store the frequency of elements in the first array
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();

        for (int num : a) {
            h1.put(num, h1.get(num) + 1);
        }

        // Check elements in the second array
        boolean flag = true;
        for (int num : b) {
            if (!h1.containsKey(num)) {
                flag = false; // Element not found in the map
                break;
            } else {
                h1.put(num, h1.get(num) - 1); // Decrease the count for matched element
                if (h1.get(num) < 0) { // If count goes negative, arrays are not equal
                    flag = false;
                    break;
                }
            }
        }

        // Check if any remaining counts in the map are non-zero
        for (int value : h1.values()) {
            if (value != 0) {
                flag = false;
                break;
            }
        }

        // Output the result
        if (flag) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}