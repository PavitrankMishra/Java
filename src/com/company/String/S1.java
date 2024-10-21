package com.company.String;
import java.util.*;

//Reverse a string

public class S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "hello";

//        1st Method Using toCharArray()
        char[] s1 = s.toCharArray();
        String res = "";
        for(int i=s1.length-1;i>=0;i--) {
            res += s1[i];
        }
        System.out.println("The string after reversing the original string : " + res);

//        2nd Method Using charAt()
        StringBuilder str1 = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
            str1.append(s.charAt(i));
        }

        System.out.println("The string after reversing the original string : " + str1.toString());

//        3rd Method using 3 variable
        StringBuilder str2 = new StringBuilder();
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length-1;
        char temp;

        while(i<j) {
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        String reversedString = new String(charArray);
        System.out.println("The string after reversing the original string : " + reversedString);

//        4th Approach Using XOR Approach
        char[] charArray2 = s.toCharArray();
        int a = 0;
        int b = charArray2.length-1;

        while(a<b) {
            charArray2[a] ^= charArray2[b];
            charArray2[b] ^= charArray2[a];
            charArray2[a] ^= charArray2[b];

            a++;
            b--;
        }

        String revString = new String(charArray2);
        System.out.println("The string after reversing the original string : " + revString);
    }
}
