package org.java.backtracking;

public class CrosswordPuzzle {

    static final int SIZE = 10;

    public static void main(String[] args) {

        char[][] board = {
                {'+','-','+','+','+','+','+','+','+','+'},
                {'+','-','+','+','+','+','+','+','+','+'},
                {'+','-','+','+','+','+','+','+','+','+'},
                {'+','-','-','-','-','-','+','+','+','+'},
                {'+','-','+','+','+','-','+','+','+','+'},
                {'+','-','+','+','+','-','+','+','+','+'},
                {'+','+','+','+','+','-','+','+','+','+'},
                {'+','+','-','-','-','-','-','-','+','+'},
                {'+','+','+','+','+','-','+','+','+','+'},
                {'+','+','+','+','+','-','+','+','+','+'}
        };

        String[] words = {
                "LONDON",
                "DELHI",
                "ICELAND",
                "ANKARA"
        };

        if (solve(board, words, 0)) {
            print(board);
        } else {
            System.out.println("No Solution");
        }
    }

    static boolean solve(char[][] board, String[] words, int index) {

        if (index == words.length)
            return true;

        String word = words[index];

        for (int row = 0; row < SIZE; row++) {

            for (int col = 0; col < SIZE; col++) {

                if (canPlaceHorizontal(board, word, row, col)) {

                    boolean[] placed = placeHorizontal(board, word, row, col);

                    if (solve(board, words, index + 1))
                        return true;

                    removeHorizontal(board, placed, row, col);
                }

                if (canPlaceVertical(board, word, row, col)) {

                    boolean[] placed = placeVertical(board, word, row, col);

                    if (solve(board, words, index + 1))
                        return true;

                    removeVertical(board, placed, row, col);
                }
            }
        }

        return false;
    }

    static boolean canPlaceHorizontal(char[][] board, String word, int row, int col) {

        if (col + word.length() > SIZE)
            return false;

        for (int i = 0; i < word.length(); i++) {

            if (board[row][col + i] == '-'
                    || board[row][col + i] == word.charAt(i))
                continue;

            return false;
        }

        return true;
    }

    static boolean[] placeHorizontal(char[][] board, String word, int row, int col) {

        boolean[] placed = new boolean[word.length()];

        for (int i = 0; i < word.length(); i++) {

            if (board[row][col + i] == '-') {

                board[row][col + i] = word.charAt(i);

                placed[i] = true;
            }
        }

        return placed;
    }

    static void removeHorizontal(char[][] board, boolean[] placed, int row, int col) {

        for (int i = 0; i < placed.length; i++) {

            if (placed[i])
                board[row][col + i] = '-';
        }
    }

    static boolean canPlaceVertical(char[][] board, String word, int row, int col) {

        if (row + word.length() > SIZE)
            return false;

        for (int i = 0; i < word.length(); i++) {

            if (board[row + i][col] == '-'
                    || board[row + i][col] == word.charAt(i))
                continue;

            return false;
        }

        return true;
    }

    static boolean[] placeVertical(char[][] board, String word, int row, int col) {

        boolean[] placed = new boolean[word.length()];

        for (int i = 0; i < word.length(); i++) {

            if (board[row + i][col] == '-') {

                board[row + i][col] = word.charAt(i);

                placed[i] = true;
            }
        }

        return placed;
    }

    static void removeVertical(char[][] board, boolean[] placed, int row, int col) {

        for (int i = 0; i < placed.length; i++) {

            if (placed[i])
                board[row + i][col] = '-';
        }
    }

    static void print(char[][] board) {

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

                System.out.print(board[i][j]);
            }

            System.out.println();
        }
    }
}
