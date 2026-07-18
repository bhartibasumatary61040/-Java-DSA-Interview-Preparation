package org.java.queue;
import java.util.*;
public class RottenOranges {

    static class Pair {

        int row, col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {

        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };

        Queue<Pair> queue = new LinkedList<>();

        int fresh = 0;
        int time = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 2)
                    queue.offer(new Pair(i,j));

                if (grid[i][j] == 1)
                    fresh++;
            }
        }

        int[][] dir = {
                {1,0},
                {-1,0},
                {0,1},
                {0,-1}
        };

        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            time++;

            while (size-- > 0) {

                Pair p = queue.poll();

                for (int[] d : dir) {

                    int nr = p.row + d[0];
                    int nc = p.col + d[1];

                    if (nr >= 0 &&
                            nc >= 0 &&
                            nr < grid.length &&
                            nc < grid[0].length &&
                            grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;

                        fresh--;

                        queue.offer(new Pair(nr,nc));
                    }
                }
            }
        }

        System.out.println(time);
    }
}
