package com.company.Trees;

import java.util.ArrayList;
import java.util.Stack;

public class Generic_Trees {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<Node>();
    }

    public static void main(String[] args) {
        Node root;

        int[] arr = new int[] {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};

        Stack<Node> st = new Stack<Node>();

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if(st.size() > 0) {
                    st.peek().children.add(t);
                }else {
                    root = t;
                }
                st.push(t);
            }
        }
    }
}
