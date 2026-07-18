package org.java.queue;
import java.util.Stack;

public class QueueUsingTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int data) {

        stack1.push(data);
    }

    public int dequeue() {

        if (stack2.isEmpty()) {

            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }

        return stack2.pop();
    }

    public static void main(String[] args) {

        QueueUsingTwoStacks q = new QueueUsingTwoStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());

        System.out.println(q.dequeue());
    }
}
