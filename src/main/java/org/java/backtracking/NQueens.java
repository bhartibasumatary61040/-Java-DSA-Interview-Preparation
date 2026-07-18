package org.java.backtracking;

public class NQueens {

    static int N = 4;

    static boolean solve(int[][] board, int col) {

        if (col == N)
            return true;

        for (int row = 0; row < N; row++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 1;

                if (solve(board, col + 1))
                    return true;

                board[row][col] = 0;
            }
        }

        return false;
    }

    static boolean isSafe(int[][] board, int row, int col) {

        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (int i = row, j = col; i < N && j >= 0; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    static void printBoard(int[][] board) {

        for (int[] row : board) {

            for (int cell : row) {

                System.out.print(cell == 1 ? "Q " : ". ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = new int[N][N];

        if (solve(board, 0))
            printBoard(board);
        else
            System.out.println("No Solution");
    }
}
