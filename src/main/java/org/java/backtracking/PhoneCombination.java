package org.java.backtracking;

public class PhoneCombination {

    static String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static void generate(String digits, int index, String result) {

        if (index == digits.length()) {
            System.out.println(result);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            generate(digits, index + 1, result + ch);
        }
    }

    public static void main(String[] args) {

        generate("23", 0, "");
    }

}
