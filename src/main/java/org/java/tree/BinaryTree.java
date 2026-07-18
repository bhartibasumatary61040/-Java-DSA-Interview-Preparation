package org.java.tree;

public class BinaryTree {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void preOrder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.print("PreOrder : ");

        preOrder(root);
    }
}
