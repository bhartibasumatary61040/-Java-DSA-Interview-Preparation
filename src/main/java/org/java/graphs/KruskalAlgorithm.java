package org.java.graphs;
import java.util.*;
public class KruskalAlgorithm {
    static class Edge {

        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {

            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static int[] parent;

    static int find(int node) {

        if (parent[node] == node)
            return node;

        return parent[node] = find(parent[node]);
    }

    static void union(int u, int v) {

        parent[find(u)] = find(v);
    }

    public static void main(String[] args) {

        int vertices = 4;

        parent = new int[vertices];

        for (int i = 0; i < vertices; i++)
            parent[i] = i;

        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,6));
        edges.add(new Edge(0,3,5));
        edges.add(new Edge(1,3,15));
        edges.add(new Edge(2,3,4));

        edges.sort((a,b) -> a.weight - b.weight);

        int cost = 0;

        for (Edge edge : edges) {

            if (find(edge.source) != find(edge.destination)) {

                union(edge.source, edge.destination);

                cost += edge.weight;

                System.out.println(edge.source + " - " +
                        edge.destination + " = " + edge.weight);
            }
        }

        System.out.println("Minimum Cost = " + cost);
    }
}
