package com.company.Stacks;

// Implementation of stack
public class st1 {
    int st1[] = new int[10];
    int max = 10;
    int top = -1;  // Initialize top to -1

    void push(int val) {
        if (top >= max - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        st1[top] = val;
        System.out.println("The pushed value is: " + st1[top]);
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;  // Return a value indicating underflow
        }
        int x = st1[top--];
        System.out.println("The popped value is: " + x);
        return x;
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;  // Return a value indicating the stack is empty
        } else {
            return st1[top];
        }
    }

    boolean isEmpty() {
        return (top < 0);
    }

    int size() {
        return top + 1;  // Return the number of elements in the stack
    }

    void show() {
        if (top >= 0) {
            for (int i = 0; i <= top; i++) {
                System.out.print(st1[i] + " ");
            }
            System.out.println();  // Print a new line after showing the stack
        } else {
            System.out.println("Stack is empty");
        }
    }

    public static void main(String[] args) {
        st1 s = new st1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);

        s.show();

        System.out.println();
        System.out.println("Popped value: " + s.pop());

        s.show();

        System.out.println();
        System.out.println("The peek element is: " + s.peek());

        s.push(29);
        System.out.println("The size of the stack is: " + s.size());

        System.out.println("Is the stack empty: " + s.isEmpty());
        s.show();

        System.out.println();
        System.out.println("Final size of the stack: " + s.size());
    }
}
