package com.company.String;

//Replace all the white space character in the string

public class S3 {
    public static void main(String[] args) {
        String str = "   j   a   va   s   t   a  r";
        String res = str.replaceAll("[\\s+]", "");
        System.out.println(res);
    }
}
