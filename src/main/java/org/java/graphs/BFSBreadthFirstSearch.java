package org.java.graphs;
import java.util.*;

public class BFSBreadthFirstSearch {
    static void bfs(List<List<Integer>> graph, int start) {

        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            System.out.print(node + " ");

            for (int neighbour : graph.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

        bfs(graph, 0);
    }
}
