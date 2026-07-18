package org.java.greedyAlgorithm;
import java.util.PriorityQueue;
public class HuffmanCoding {

    static class Node{

        int frequency;

        Node left,right;

        Node(int frequency){

            this.frequency=frequency;
        }
    }

    public static void main(String[] args) {

        int[] freq={5,9,12,13,16,45};

        PriorityQueue<Node> pq=
                new PriorityQueue<>((a,b)->a.frequency-b.frequency);

        for(int f:freq)
            pq.offer(new Node(f));

        while(pq.size()>1){

            Node left=pq.poll();
            Node right=pq.poll();

            Node root=new Node(left.frequency+right.frequency);

            root.left=left;
            root.right=right;

            pq.offer(root);
        }

        System.out.println("Root Frequency = "+pq.peek().frequency);
    }
}
