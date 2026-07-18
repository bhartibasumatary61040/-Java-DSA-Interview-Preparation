package org.java.stack;
import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }

    public void pop() {

        if (stack.peek().equals(minStack.peek()))
            minStack.pop();

        stack.pop();
    }

    public int getMin() {

        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(30);
        s.push(10);
        s.push(20);
        s.push(5);

        System.out.println(s.getMin());

        s.pop();

        System.out.println(s.getMin());
    }
}
