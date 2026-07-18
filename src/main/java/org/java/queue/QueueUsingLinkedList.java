package org.java.queue;

public class QueueUsingLinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front;
    Node rear;

    public void enqueue(int data) {

        Node node = new Node(data);

        if (rear == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public int dequeue() {

        if (front == null)
            return -1;

        int value = front.data;

        front = front.next;

        if (front == null)
            rear = null;

        return value;
    }

    public void display() {

        Node temp = front;

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
    }
}
