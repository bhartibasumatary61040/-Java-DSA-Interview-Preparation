package org.java.graphs;
import java.util.*;
public class DetectCycleDirected {

    static boolean dfs(List<List<Integer>> graph,
                       int node,
                       boolean[] visited,
                       boolean[] pathVisited) {

        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbour : graph.get(node)) {

            if (!visited[neighbour]) {

                if (dfs(graph, neighbour, visited, pathVisited))
                    return true;

            } else if (pathVisited[neighbour]) {

                return true;
            }
        }

        pathVisited[node] = false;

        return false;
    }

    public static void main(String[] args) {

        int vertices = 4;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(3).add(1);

        boolean[] visited = new boolean[vertices];
        boolean[] pathVisited = new boolean[vertices];

        System.out.println(dfs(graph,0,visited,pathVisited));
    }
}
