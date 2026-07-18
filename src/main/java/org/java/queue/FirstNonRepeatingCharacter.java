package org.java.queue;
import java.util.*;
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String stream = "aabc";

        Queue<Character> queue = new LinkedList<>();

        int[] freq = new int[26];

        for (char ch : stream.toCharArray()) {

            freq[ch - 'a']++;

            queue.offer(ch);

            while (!queue.isEmpty() &&
                    freq[queue.peek() - 'a'] > 1) {

                queue.poll();
            }

            if (queue.isEmpty())
                System.out.print("# ");
            else
                System.out.print(queue.peek() + " ");
        }
    }


}
