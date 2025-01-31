package com.company.Strings;

public class Check_If_Given_String_Is_Panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";


        for(char c = 'a';c<='z';c++) {
            boolean flag = false;
            for(int i=0;i<s.length();i++) {
                if(c == Character.toLowerCase(s.charAt(i))) {
                    flag = true;
                    break;
                }
            }

            if(flag == false) {
                System.out.println("The string is not a panagram");
                return;
            }
        }

        System.out.println("The string is a panagram:");
    }
}
