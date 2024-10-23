package com.company.String;
import java.util.*;

//Check whether a string is well formed or not i.e. the string is balanced or unbalanced

public class S11 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();

        String s = "{()}";

        boolean isBalanced = true;
        for(char ch:s.toCharArray()) {
            if(ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else if(ch == '}') {
                if(st.peek() == '{') {
                    st.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            } else if(ch == ']') {
                if(st.peek() == '[') {
                    st.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            } else if(ch == ')') {
                if(st.peek() == '(') {
                    st.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            } else {
                continue;
            }

        }
        if(isBalanced) {
            System.out.println("The string is true");
        } else {
            System.out.println("The string is false");
        }
    }
}
