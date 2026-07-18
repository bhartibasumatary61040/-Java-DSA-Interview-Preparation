package org.java.stack;

public class StackUsingArray {

    int[] stack = new int[5];
    int top = -1;

    public void push(int data) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = data;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    public int peek() {

        if (top == -1)
            return -1;

        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {

        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        StackUsingArray s = new StackUsingArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Pop = " + s.pop());

        System.out.println("Peek = " + s.peek());
    }
}
