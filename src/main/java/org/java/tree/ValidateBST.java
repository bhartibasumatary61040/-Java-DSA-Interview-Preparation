package org.java.tree;

public class ValidateBST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isBST(Node root, int min, int max) {

        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data)
                && isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        Node root = new Node(20);

        root.left = new Node(10);
        root.right = new Node(30);

        root.left.left = new Node(5);
        root.left.right = new Node(15);

        root.right.left = new Node(25);
        root.right.right = new Node(40);

        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
