package com.company.Linkedlist.Basic;

public class Create_Linkedlist {
    public static class Node {
        int data;
        Node next;
    }

    public static class Linkedlist {
        Node head;
        Node tail;
        int size;

        void addLast (int val) {
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

        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0) {
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

            if(idx == 0) {
                addFirst(val);
            } else if(idx == size-1) {
                addLast(val);
            } else {
                Node current = head;
                for(int i=0;i<idx-1;i++) {
                    current = current.next;
                }
                temp.next = current.next;
                current.next = temp;
                size++;
            }
        }

        void removeLast() {
            Node current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            tail = current;
            size--;
        }

        void removeFirst() {
            head = head.next;
            size--;
        }

        void removeAt(int idx) {
            if(idx == 0) {
                removeFirst();
            } else if(idx == size-1) {
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

        int getFirst() {
            return head.data;
        }

        int getLast() {
            return tail.data;
        }

        int getAt(int idx) {
            Node temp = head;
            for(int i=0;i<idx;i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
            Node current = head;
            while(current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }

        int getSize() {
            return size;
        }
    }
    public static void main(String[] args) {
        Linkedlist ll1 = new Linkedlist();
        ll1.addLast(1);
        System.out.println(ll1.getSize());
        ll1.addFirst(10);
        System.out.println(ll1.getSize());
        ll1.addLast(2);
        System.out.println(ll1.getSize());
        ll1.addLast(3);
        System.out.println(ll1.getSize());
        ll1.addLast(4);
        System.out.println(ll1.getSize());
        ll1.addLast(5);
        System.out.println(ll1.getSize());
        ll1.addAt(3, 45);
        ll1.display();
        ll1.removeLast();
        System.out.println();
        ll1.display();
        ll1.removeFirst();
        ll1.display();
        ll1.removeAt(4);
        ll1.display();
        System.out.println();
        System.out.println(ll1.getFirst());
        ll1.display();
        System.out.println();
        System.out.println(ll1.getLast());
        ll1.display();
        System.out.println();
        System.out.println(ll1.getAt(3));
        ll1.display();
    }
}
