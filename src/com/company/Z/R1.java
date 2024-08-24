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

        void addFirst(int val){
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
            System.out.println("The size is: " + size);
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

            if(size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }



        void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else {
                head = head.next;
                size--;
            }
        }

        void removeAt(int idx) {
            if(size == 0) {
                System.out.println("List is empty");
            } else {
                Node current = head;
                for(int i=0;i<idx-1;i++) {
                    current = current.next;
                }
                current.next = current.next.next;
                size--;
            }
        }
        void removeLast() {
            if(size == 0) {
                System.out.println("List is empty");
            } else {
                Node current = head;
                for(int i=0;i<size - 2;i++) {
                    current = current.next;
                }
                tail = current;
                current.next = null;
                size--;
            }
        }

        int getFirst() {
            if(size == 0) {
                return -1;
            }else {
                return head.data;
            }
        }

        int getLast() {
            if(size == 0) {
                return -1;
            } else {
                return tail.data;
            }
        }

        int getAt(int idx) {
            if(size == 0) {
                return -1;
            }  else {
                Node current = head;
                for(int i=0;i<idx;i++) {
                    current = current.next;
                }
                return current.data;
            }
        }

        int getSize() {
            return size;
        }

        void show() {
            Node current = head;
            while(current != null) {
                System.out.print(current.data + "->" );
                current = current.next;
            }
            System.out.print("null");
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);
        l1.addFirst(6);

        l1.show();
        System.out.println();
        System.out.println("The size is: " + l1.getSize());

        l1.addLast(11);
        l1.addLast(12);
        l1.addLast(13);
        l1.addLast(14);
        l1.addLast(15);
        l1.addLast(16);

        l1.show();
        System.out.println();
        System.out.println("The size is: " + l1.getSize());

        l1.addAt(5, 21);

        l1.show();
        System.out.println();
        System.out.println("The size is: " + l1.getSize());

        l1.removeFirst();

        l1.show();
        System.out.println();
        System.out.println("The size is: " + l1.getSize());

        l1.removeLast();
        l1.show();
        System.out.println();
        System.out.println("The size is: " + l1.getSize());

        l1.removeAt(5);
        l1.show();
        System.out.println();
        System.out.println("The size is: " + l1.getSize());

        int first = l1.getFirst();
        System.out.println(first);
        int last = l1.getLast();
        System.out.println(last);
        int fifth = l1.getAt(5);
        System.out.println(fifth);
    }
}
