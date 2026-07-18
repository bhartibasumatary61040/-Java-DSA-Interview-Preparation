package org.java.backtracking;

public class RatInMaze {

    static int N = 4;

    static boolean solveMaze(int[][] maze, int row, int col) {

        if (row == N - 1 && col == N - 1) {
            maze[row][col] = 2;
            return true;
        }

        if (isSafe(maze, row, col)) {

            maze[row][col] = 2;

            // Down
            if (solveMaze(maze, row + 1, col))
                return true;

            // Right
            if (solveMaze(maze, row, col + 1))
                return true;

            // Backtrack
            maze[row][col] = 1;
        }

        return false;
    }

    static boolean isSafe(int[][] maze, int row, int col) {

        return row >= 0 &&
                row < N &&
                col >= 0 &&
                col < N &&
                maze[row][col] == 1;
    }

    static void printMaze(int[][] maze) {

        for (int[] rows : maze) {
            for (int cell : rows) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        if (solveMaze(maze, 0, 0)) {

            System.out.println("Path Found\n");
            printMaze(maze);

        } else {

            System.out.println("No Path Exists");
        }
    }
}
