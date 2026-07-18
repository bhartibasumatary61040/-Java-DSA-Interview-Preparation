package org.java.stack;
import java.util.Stack;

public class SortStack {

    static void sort(Stack<Integer> stack) {

        if (!stack.isEmpty()) {

            int temp = stack.pop();

            sort(stack);

            insert(stack, temp);
        }
    }

    static void insert(Stack<Integer> stack, int value) {

        if (stack.isEmpty() || value > stack.peek()) {

            stack.push(value);

            return;
        }

        int temp = stack.pop();

        insert(stack, value);

        stack.push(temp);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(40);
        stack.push(20);

        sort(stack);

        System.out.println(stack);
    }
}
