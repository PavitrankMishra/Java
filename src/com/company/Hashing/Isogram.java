package com.company.Hashing;
import java.util.*;
public class Isogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new word: ");
        String s = sc.nextLine();
        HashSet<Character> hs = new HashSet<Character>();
        boolean flag = true;

        for(int i=0;i<s.length();i++) {
            if(!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
            } else {
                flag = false;
            }
        }

        if(flag) {
            System.out.println(s + " is an isogram");
        } else {
            System.out.println(s + " is not an isogram");
        }
    }
}
