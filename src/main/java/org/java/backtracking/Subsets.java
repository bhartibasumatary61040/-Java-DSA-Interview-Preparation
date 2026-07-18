package org.java.backtracking;
import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static void subset(int[] arr, int index, List<Integer> list) {

        if (index == arr.length) {
            System.out.println(list);
            return;
        }

        // Include
        list.add(arr[index]);
        subset(arr, index + 1, list);

        // Backtrack
        list.remove(list.size() - 1);

        // Exclude
        subset(arr, index + 1, list);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        subset(arr, 0, new ArrayList<>());
    }
}
