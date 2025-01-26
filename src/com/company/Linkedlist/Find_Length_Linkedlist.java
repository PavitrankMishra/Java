package com.company.Linkedlist;

import java.util.*;
public class Find_Length_Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        int count = 0;

        for(int element:list) {
            count++;
        }
        System.out.println(count);
    }
}
