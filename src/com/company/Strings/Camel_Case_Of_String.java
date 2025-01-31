package com.company.Strings;

public class Camel_Case_Of_String {
    public static void main(String[] args) {
        String s = "i got intern at geeksforgeeks";

        StringBuilder res = new StringBuilder();
        boolean capitalise = false;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ') {
                capitalise = true;
            } else if(capitalise == true) {
                res.append(Character.toUpperCase(s.charAt(i)));
                capitalise = false;
            } else {
                res.append(s.charAt(i));
            }
        }

        System.out.println("The updated string is: " + res);
    }
}
