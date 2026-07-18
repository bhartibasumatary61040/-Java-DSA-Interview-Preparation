package org.java.queue;
import java.util.LinkedList;
import java.util.Queue;
public class GenerateBinaryNumbers {

    public static void generate(int n) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        for (int i = 0; i < n; i++) {

            String current = queue.poll();

            System.out.println(current);

            queue.offer(current + "0");
            queue.offer(current + "1");
        }
    }

    public static void main(String[] args) {

        generate(5);
    }

}
