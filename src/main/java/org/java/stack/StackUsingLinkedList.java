package org.java.stack;

public class StackUsingLinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top;

    public void push(int data) {

        Node node = new Node(data);

        node.next = top;

        top = node;
    }

    public int pop() {

        if (top == null)
            return -1;

        int value = top.data;

        top = top.next;

        return value;
    }

    public int peek() {

        if (top == null)
            return -1;

        return top.data;
    }

    public void display() {

        Node temp = top;

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
    }
}
