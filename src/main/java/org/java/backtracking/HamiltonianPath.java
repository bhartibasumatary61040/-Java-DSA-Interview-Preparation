package org.java.backtracking;

public class HamiltonianPath {

    static int V = 5;

    static boolean solve(int[][] graph, int[] path, int pos) {

        if (pos == V)
            return true;

        for (int v = 1; v < V; v++) {

            if (isSafe(graph, path, v, pos)) {

                path[pos] = v;

                if (solve(graph, path, pos + 1))
                    return true;

                path[pos] = -1;
            }
        }

        return false;
    }

    static boolean isSafe(int[][] graph, int[] path, int v, int pos) {

        if (graph[path[pos - 1]][v] == 0)
            return false;

        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;

        return true;
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0,1,1,0,1},
                {1,0,1,1,0},
                {1,1,0,1,1},
                {0,1,1,0,1},
                {1,0,1,1,0}
        };

        int[] path = new int[V];

        for(int i=0;i<V;i++)
            path[i]=-1;

        path[0]=0;

        if(solve(graph,path,1)){

            for(int x:path)
                System.out.print(x+" ");
        }
    }
}
