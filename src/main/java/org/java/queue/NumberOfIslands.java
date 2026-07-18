package org.java.queue;
import java.util.*;

public class NumberOfIslands {

    static class Pair {

        int row, col;

        Pair(int row, int col) {

            this.row = row;
            this.col = col;
        }
    }

    static void bfs(char[][] grid, int row, int col) {

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(row,col));

        grid[row][col] = '0';

        int[][] dir = {
                {1,0},
                {-1,0},
                {0,1},
                {0,-1}
        };

        while (!queue.isEmpty()) {

            Pair p = queue.poll();

            for (int[] d : dir) {

                int nr = p.row + d[0];
                int nc = p.col + d[1];

                if (nr >= 0 &&
                        nc >= 0 &&
                        nr < grid.length &&
                        nc < grid[0].length &&
                        grid[nr][nc] == '1') {

                    grid[nr][nc] = '0';

                    queue.offer(new Pair(nr,nc));
                }
            }
        }
    }

    public static void main(String[] args) {

        char[][] grid = {
                {'1','1','0'},
                {'0','1','0'},
                {'1','0','1'}
        };

        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {

                    bfs(grid,i,j);

                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
