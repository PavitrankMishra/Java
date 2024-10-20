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

            if(idx<0 || idx > size) {
                System.out.println("Invalid Index");
                return;
            }

            Node current = head;
            if(idx == 0) {
                addFirst(val);
            } else if(idx == size) {
                addLast(val);
            } else {
                for(int i=0;i<idx-1;i++) {
                    current = current.next;
                }
                temp.next = current.next;
                current.next = temp;
                size++;
            }
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
            if(size == 0 ){
                System.out.println("Linkedlist is empty");
            } else {
                head = head.next;
                size--;
            }
        }

        void removeAt(int idx) {
            if(idx < 0 || idx > size) {
                System.out.println("Invalid index");
            }

            if(idx == 0) {
                removeFirst();
            } else if (idx == size) {
                removeLast();
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
            Node current = head;
            if(size == 0) {
                System.out.println("Linkedlist is empty");
                return;
            } else {
                for(int i=0;i<size-2;i++) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
                size--;
            }
        }

        int getFirst() {
            return head.data;
        }

        int getLast() {
            return tail.data;
        }

        int getAt(int idx) {
            Node current = head;
            for(int i=0;i<idx;i++) {
                current = current.next;
            }
            return current.data;
        }
        
        void show() {
            Node current = head;
            if(size == 0) {
                System.out.println("No element present");
            } else {
                while(current != null) {
                    System.out.print(current.data + "->");
                    current = current.next;
                }
                System.out.print("null");
            }
        }

        int getSize() {
            return size;
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
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.getSize());

        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);

        l1.show();
        System.out.println();
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.getSize());

        l1.addAt(5,98);

        l1.show();
        System.out.println();
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.getSize());

        l1.addAt(9, 79);
        l1.show();

        l1.removeFirst();

        System.out.println();
        l1.show();
        System.out.println();
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.getSize());

        l1.removeLast();
        System.out.println();
        l1.show();
        System.out.println();
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.getSize());

        l1.removeAt(3);
        System.out.println();
        l1.show();
        System.out.println();
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.getSize());

        l1.addAt(2,98);

        l1.show();
        System.out.println();
        System.out.println(l1.head.data);
        System.out.println(l1.tail.data);
        System.out.println(l1.getSize());

        System.out.println("The first value is: " + l1.getFirst());
        System.out.println("The last value is: " + l1.getLast());
        System.out.println("The value at posiition is: " + l1.getAt(6));
    }
}