package com.company.Stack;

public class Implementation_Stack {
    public static class Stack {
        static final int max = 1000;
        int top;
        int a[] = new int[max];

        Stack() {
            top = -1;
        }

        boolean isEmpty() {
            return top<0;
        }

        boolean push(int x) {
            if(top >= (max-1)) {
                System.out.println("Stack Overflow");
                return false;
            } else {
                a[++top] = x;
                System.out.println(x + " pushed into stack");
                return true;
            }
        }

        int pop() {
            if(top<0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int x = a[top--];
                return x;
            }
        }

        int peek() {
            if(top<0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int x = a[top];
                return x;
            }
        }

        void print() {
            for(int i=top;i>=0;i--) {
                System.out.print(" " + a[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.print();
        s.pop();
        s.pop();
        s.pop();

        System.out.println();
        s.print();
    }
}
