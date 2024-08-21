package com.company.Z;

public class R1 {
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

            if(size==0) {
                head = tail = temp;
            }else {
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
            for(int i=0;i<idx-1;i++) {
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

            if(tail == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void removeFirst() {
            if(size == 0) {
                System.out.println("Linked list is empty");
            }else {
                head = head.next;
                size--;
            }
        }

        void removeAt(int idx) {
            Node current = head;
            for(int i=0;i<idx-1;i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }

        void removeLast() {
            if(size == 0) {
                System.out.println("Linked list is empty");
            }else {
                Node current = head;
                for(int i=0;i<size-2;i++) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
                size--;
            }
        }

        void show() {
            Node current = head;
            while(current!= null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);

        l1.addFirst(11);
        l1.addFirst(12);
        l1.addFirst(13);
        l1.addFirst(14);
        l1.addFirst(15);

        l1.addAt(4,21);

        l1.show();

        l1.removeFirst();
        System.out.println();
        l1.show();
        System.out.println();

        l1.removeLast();
        l1.show();
        System.out.println();
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.size);

        l1.removeAt(5);

        l1.show();
    }
}
