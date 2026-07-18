package org.java.graphs;
import java.util.*;
public class PrimAlgorithm {

    static class Pair {

        int vertex;
        int weight;

        Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static void prim(List<List<Pair>> graph) {

        int vertices = graph.size();

        boolean[] visited = new boolean[vertices];

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> a.weight - b.weight);

        pq.offer(new Pair(0, 0));

        int totalCost = 0;

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            if (visited[current.vertex])
                continue;

            visited[current.vertex] = true;

            totalCost += current.weight;

            for (Pair neighbour : graph.get(current.vertex)) {

                if (!visited[neighbour.vertex]) {

                    pq.offer(neighbour);
                }
            }
        }

        System.out.println("Minimum Cost = " + totalCost);
    }

    public static void main(String[] args) {

        int vertices = 5;

        List<List<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(new Pair(1,2));
        graph.get(1).add(new Pair(0,2));

        graph.get(0).add(new Pair(3,6));
        graph.get(3).add(new Pair(0,6));

        graph.get(1).add(new Pair(2,3));
        graph.get(2).add(new Pair(1,3));

        graph.get(1).add(new Pair(3,8));
        graph.get(3).add(new Pair(1,8));

        graph.get(1).add(new Pair(4,5));
        graph.get(4).add(new Pair(1,5));

        graph.get(2).add(new Pair(4,7));
        graph.get(4).add(new Pair(2,7));

        prim(graph);
    }
}
