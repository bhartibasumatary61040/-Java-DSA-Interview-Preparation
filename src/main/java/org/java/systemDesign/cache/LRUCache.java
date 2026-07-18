package org.java.systemDesign.cache;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node {

        int key;
        int value;

        Node prev;
        Node next;

        Node(int key, int value) {

            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;

    private final Map<Integer, Node> map;

    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;

        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    private void addNode(Node node) {

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToFront(Node node) {

        removeNode(node);
        addNode(node);
    }

    private Node removeLast() {

        Node last = tail.prev;

        removeNode(last);

        return last;
    }

    public int get(int key) {

        if (!map.containsKey(key))
            return -1;

        Node node = map.get(key);

        moveToFront(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.value = value;

            moveToFront(node);

        } else {

            if (map.size() == capacity) {

                Node last = removeLast();

                map.remove(last.key);
            }

            Node newNode = new Node(key, value);

            addNode(newNode);

            map.put(key, newNode);
        }
    }

    public void display() {

        Node current = head.next;

        while (current != tail) {

            System.out.print("(" + current.key + "," + current.value + ") ");

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(3);

        cache.put(1, 100);
        cache.put(2, 200);
        cache.put(3, 300);

        cache.display();

        cache.get(1);

        cache.display();

        cache.put(4, 400);

        cache.display();

        System.out.println("Get 2 : " + cache.get(2));

        System.out.println("Get 4 : " + cache.get(4));
    }
}
