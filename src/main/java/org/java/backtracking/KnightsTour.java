package org.java.backtracking;

public class KnightsTour {

    static int N = 5;

    static int[] rowMove = {2,1,-1,-2,-2,-1,1,2};
    static int[] colMove = {1,2,2,1,-1,-2,-2,-1};

    static boolean solve(int[][] board, int row, int col, int move) {

        if (move == N * N)
            return true;

        for (int i = 0; i < 8; i++) {

            int nr = row + rowMove[i];
            int nc = col + colMove[i];

            if (isSafe(board, nr, nc)) {

                board[nr][nc] = move;

                if (solve(board, nr, nc, move + 1))
                    return true;

                board[nr][nc] = -1;
            }
        }

        return false;
    }

    static boolean isSafe(int[][] board, int r, int c) {

        return r >= 0 && r < N &&
                c >= 0 && c < N &&
                board[r][c] == -1;
    }

    public static void main(String[] args) {

        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = -1;

        board[0][0] = 0;

        solve(board,0,0,1);

        for(int[] row:board){

            for(int x:row)
                System.out.printf("%2d ",x);

            System.out.println();
        }
    }
}
