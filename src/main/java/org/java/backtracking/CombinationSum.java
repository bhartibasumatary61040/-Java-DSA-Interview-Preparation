package org.java.backtracking;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    static void combination(int[] arr, int target, int index, List<Integer> list) {

        if (target == 0) {
            System.out.println(list);
            return;
        }

        if (target < 0 || index == arr.length) {
            return;
        }

        // Include current element
        list.add(arr[index]);
        combination(arr, target - arr[index], index, list);

        // Backtrack
        list.remove(list.size() - 1);

        // Exclude current element
        combination(arr, target, index + 1, list);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 7};

        combination(arr, 7, 0, new ArrayList<>());
    }

}
