package org.java.graphs;
import java.util.*;
public class DetectCycleUndirected {

    static boolean dfs(List<List<Integer>> graph, int node,
                       boolean[] visited, int parent) {

        visited[node] = true;

        for (int neighbour : graph.get(node)) {

            if (!visited[neighbour]) {

                if (dfs(graph, neighbour, visited, node))
                    return true;

            } else if (neighbour != parent) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int vertices = 4;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(0);
        graph.get(0).add(2);

        boolean[] visited = new boolean[vertices];

        System.out.println(dfs(graph,0,visited,-1));
    }
}
