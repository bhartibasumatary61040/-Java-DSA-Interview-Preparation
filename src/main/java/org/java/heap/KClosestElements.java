package org.java.heap;
import java.util.*;
public class KClosestElements {

    static class Pair {

        int value;
        int diff;

        Pair(int value, int diff) {

            this.value = value;
            this.diff = diff;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9};

        int k = 3;
        int x = 7;

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a,b) -> b.diff - a.diff);

        for(int num : arr){

            pq.offer(new Pair(num,Math.abs(num-x)));

            if(pq.size() > k)
                pq.poll();
        }

        while(!pq.isEmpty()){

            System.out.print(pq.poll().value + " ");
        }
    }
}
