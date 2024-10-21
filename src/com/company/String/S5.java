package com.company.String;

import java.util.*;

//Sort the string alphabetically

public class S5 {
    public static void main(String[] args) {
        String str = "rock";
        char[] strArray = str.toCharArray();

        char temp;

        for(int i=0;i<strArray.length;i++) {
            for(int j=i+1;j<strArray.length;j++) {
                if(strArray[i] > strArray[j]) {
                    temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        System.out.println(new String(strArray));
    }
}
