package com.company.String;

//Remove Special Characters

public class S2 {
    public static void main(String[] args) {
        String str = "$ja!va$&st%ar";

//        Using the replaceAll Method
        String replacedString = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("The string after replacing the characters is: " + replacedString);
    }
}
