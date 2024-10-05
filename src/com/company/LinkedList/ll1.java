package com.company.LinkedList;

public class ll1 {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void addAt(int idx, int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            Node current = head;
            for(int i=0;i<idx-2;i++) {
                current = current.next;
            }

            temp.next = current.next;
            current.next = temp;
            size++;
        }

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void show() {
            Node current = head;
            while(current != null) {
                System.out.print(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(5);
        l1.addLast(6);
        l1.addLast(7);
        l1.addLast(8);
        l1.show();
        System.out.println();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.show();
        System.out.println();
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.size);

        l1.addAt(2,31);
        l1.addAt(5,48);
        l1.show();


    }
}