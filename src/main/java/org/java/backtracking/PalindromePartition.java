package org.java.backtracking;
import java.util.*;

public class PalindromePartition {

    static void partition(String s, int index, List<String> list) {

        if (index == s.length()) {
            System.out.println(list);
            return;
        }

        for (int i = index; i < s.length(); i++) {

            String part = s.substring(index, i + 1);

            if (isPalindrome(part)) {

                list.add(part);

                partition(s, i + 1, list);

                list.remove(list.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            if (s.charAt(l++) != s.charAt(r--))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        partition("aab", 0, new ArrayList<>());
    }
}
