package com.company.Strings;

public class Find_Length_Strings {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("The length of the string is: " + s.length());

//        Check if two strings are same
        String b = "ABC";
        String c = "DEF";

        System.out.println("Are these 2 strings equal ? " + b.equals(c));

//        Search a character
        String a1 = "geeksforgeeks";
        char a2 = 'k';
        boolean flag = false;
        for(int i=0;i<a1.length();i++) {
            char ch = a1.charAt(i);
            if(ch == a2) {
                flag = true;
                break;
            }
        }

        System.out.println("Is a2 character present in a1 ? " + flag);

//        Insert a character in a string at given position
        String a3 = "Geeks";
        char a4 = 'A';
        int pos = 3;

        StringBuilder str = new StringBuilder(a3);
        str.insert(pos,a4);
        System.out.println(str.toString());

//        Using conventional method
        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<a3.length();i++) {
            if(i == pos) {
                str1.append(a4);
            }
            str1.append(a3.charAt(i));
        }

        System.out.println("The string after appending the character is " + str1.toString());

//        Remove a character from a given location
        int pos1 = 2;
        String a5 = "abcde";

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a5.length();i++) {
            if(i == pos1) {
                continue;
            } else {
                sb.append(a5.charAt(i));
            }
        }

        System.out.println("The string after removing the character is: " + sb.toString());

//        Insert a character at multiple positions
        String a6 = "geeksforgeeks";
        int [] chars = new int [] {1,5,7,9};

        StringBuilder a7 = new StringBuilder();
        int j = 0;
        for(int i=0;i<a6.length();i++) {
            if(j<chars.length && i == chars[j]) {
                a7.append("*");
                j++;
            }
            a7.append(a6.charAt(i));
        }

        System.out.println("The updated string after insertion is: " + a7.toString());

//        Remove all occurrences of a character

        String a8 = "geeksforgeeks";
        char a9 = 'e';

        StringBuilder a10 = new StringBuilder();
        for(int i=0;i<a8.length();i++) {
            if(a8.charAt(i) == a9) {
                continue;
            } else {
                a10.append(a8.charAt(i));
            }
        }

        System.out.println("The string after removing the occurrence is: " + a10.toString());
    }
}
