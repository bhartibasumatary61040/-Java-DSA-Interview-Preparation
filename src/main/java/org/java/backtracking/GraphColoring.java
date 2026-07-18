package org.java.backtracking;
import java.util.*;

public class GraphColoring {

    static boolean fill(String[][] grid, String[] colors, int row, int col) {

        int rows = grid.length;
        int cols = grid[0].length;

        if (row == rows)
            return true;

        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == cols) {
            nextRow++;
            nextCol = 0;
        }

        for (String color : colors) {

            if (isSafe(grid, row, col, color)) {

                grid[row][col] = color;

                if (fill(grid, colors, nextRow, nextCol))
                    return true;

                grid[row][col] = null;
            }
        }

        return false;
    }

    static boolean isSafe(String[][] grid, int row, int col, String color) {

        int[][] dir = {
                {-1,0},
                {1,0},
                {0,-1},
                {0,1}
        };

        for (int[] d : dir) {

            int nr = row + d[0];
            int nc = col + d[1];

            if (nr >= 0 && nr < grid.length &&
                    nc >= 0 && nc < grid[0].length &&
                    color.equals(grid[nr][nc])) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String[][] grid = new String[4][4];

        String[] colors = {"Red","Green","Blue"};

        fill(grid, colors, 0, 0);

        for (String[] row : grid)
            System.out.println(Arrays.toString(row));
    }
}
