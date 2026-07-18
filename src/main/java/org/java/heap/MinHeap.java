package org.java.heap;

public class MinHeap {

    int[] heap = new int[20];
    int size = 0;

    void insert(int value) {

        heap[size] = value;

        int current = size;

        while (current > 0 &&
                heap[current] < heap[(current - 1) / 2]) {

            int temp = heap[current];
            heap[current] = heap[(current - 1) / 2];
            heap[(current - 1) / 2] = temp;

            current = (current - 1) / 2;
        }

        size++;
    }

    void print() {

        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
    }

    public static void main(String[] args) {

        MinHeap h = new MinHeap();

        h.insert(50);
        h.insert(30);
        h.insert(20);
        h.insert(40);
        h.insert(60);

        h.print();
    }
}
