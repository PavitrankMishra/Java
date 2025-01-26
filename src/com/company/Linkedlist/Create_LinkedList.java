package com.company.Linkedlist;

public class Create_LinkedList {
    public static class Node {
        int data;
        Node next;
    }
    public static class Linkedlist {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            if(size == 0) {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                head = tail = temp;
                size++;
            } else {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                tail.next = temp;
                tail = temp;
                size++;
            }
        }

        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            temp.next = head;
            head = temp;
            size++;
        }

        void addAt(int val, int idx) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if(idx > size || idx < 0) {
                System.out.println("Invalid index");
            } else if(idx == 0) {
                addFirst(val);
            } else if(idx == size) {
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

        int removeFirst() {
            head = head.next;
            size--;
            return head.data;
        }
        int removeLast() {
            Node current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            tail = current;
            size--;

            return current.data;
        }

        int removeAt(int idx) {
            Node current = head;
            if(idx < 0 || idx > size) {
                return -1;
            } else if(idx == 0) {
                removeFirst();
            } else if(idx == size) {
                removeLast();
            } else {
                for(int i=0;i<idx-1;i++) {
                    current = current.next;
                }
                current.next = current.next.next;
                size--;
            }
            return current.data;
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
        void display() {
            Node current = head;
            while(current!=null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll1 = new Linkedlist();
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(3);
        ll1.addFirst(10);
        ll1.display();
        ll1.addAt(21,2);
        System.out.println();
        ll1.display();
        System.out.println();
        System.out.println(ll1.size());

        ll1.removeFirst();
        ll1.display();
        System.out.println();
        System.out.println(ll1.size());

        ll1.removeLast();
        ll1.display();
        System.out.println();
        System.out.println(ll1.size());

        ll1.addLast(4);
        ll1.addLast(5);
        ll1.addLast(6);
        ll1.addLast(7);

        ll1.removeAt(2);
        ll1.display();
        System.out.println();
        System.out.println(ll1.size());

        System.out.println(ll1.getFirst());

        System.out.println(ll1.getLast());

        System.out.println(ll1.getAt(3));
    }
}
