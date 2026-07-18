package org.java.heap;
import java.util.PriorityQueue;
public class KthLargestElement {

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};

        int k = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {

            pq.offer(num);

            if (pq.size() > k)
                pq.poll();
        }

        System.out.println("Kth Largest = " + pq.peek());
    }
}
