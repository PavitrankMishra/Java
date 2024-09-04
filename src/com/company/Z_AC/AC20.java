package com.company.Z_AC;

//Return the largest size of the word form a string seperated by dot

public class AC20 {
    public static void main(String[] args) {
        String str = "hello.world.from.shaurya";

        int maxLength = 0;
        int currentLength = 0;
        String currentword = "";
        String maxWord = "";
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) != '.') {
                currentLength++;
                currentword += str.charAt(i);
            } else {
                if(currentLength > maxLength) {
                    maxLength = currentLength;
                    maxWord = currentword;
                }
                currentLength = 0;
                currentword = "";
            }
        }
        System.out.println(maxWord);
    }
}
