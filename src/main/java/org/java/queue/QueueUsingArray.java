package org.java.queue;

public class QueueUsingArray {

    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    int size = 0;

    public void enqueue(int data) {

        if (size == queue.length) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {

        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];
        front++;
        size--;

        return value;
    }

    public int peek() {

        if (size == 0)
            return -1;

        return queue[front];
    }

    public void display() {

        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        QueueUsingArray q = new QueueUsingArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued : " + q.dequeue());

        q.display();
    }
}
