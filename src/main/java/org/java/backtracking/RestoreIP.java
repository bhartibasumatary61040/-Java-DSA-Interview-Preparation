package org.java.backtracking;

public class RestoreIP {

    static void restore(String s, int index, int part, String current) {

        if (part == 4 && index == s.length()) {
            System.out.println(current.substring(0, current.length() - 1));
            return;
        }

        if (part == 4 || index == s.length())
            return;

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {

            String str = s.substring(index, index + len);

            if ((str.startsWith("0") && str.length() > 1) ||
                    Integer.parseInt(str) > 255)
                continue;

            restore(s, index + len, part + 1, current + str + ".");
        }
    }

    public static void main(String[] args) {

        restore("25525511135", 0, 0, "");
    }

}
