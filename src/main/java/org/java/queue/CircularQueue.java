package org.java.queue;

public class CircularQueue {

    int[] queue = new int[5];

    int front = -1;
    int rear = -1;

    public void enqueue(int data) {

        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue Full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % queue.length;

        queue[rear] = data;
    }

    public int dequeue() {

        if (front == -1) {
            System.out.println("Queue Empty");
            return -1;
        }

        int value = queue[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }

        return value;
    }

    public void display() {

        if (front == -1)
            return;

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}
