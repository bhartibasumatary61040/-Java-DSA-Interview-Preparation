package org.java.backtracking;

public class SudokuSolver {

    static boolean solve(int[][] board) {

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == 0) {

                    for (int num = 1; num <= 9; num++) {

                        if (isSafe(board, row, col, num)) {

                            board[row][col] = num;

                            if (solve(board))
                                return true;

                            board[row][col] = 0;
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {

        for (int i = 0; i < 9; i++) {

            if (board[row][i] == num)
                return false;

            if (board[i][col] == num)
                return false;
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {

            for (int j = startCol; j < startCol + 3; j++) {

                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    static void print(int[][] board) {

        for (int[] row : board) {

            for (int num : row)
                System.out.print(num + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = {
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };

        solve(board);
        print(board);
    }
}
