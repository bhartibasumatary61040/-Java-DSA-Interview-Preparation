package org.java.graphs;
import java.util.*;
public class BellmanFord {

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

    public static void bellmanFord(List<Edge> edges,
                                   int vertices,
                                   int source) {

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        for (int i = 1; i < vertices; i++) {

            for (Edge edge : edges) {

                if (distance[edge.source] != Integer.MAX_VALUE &&
                        distance[edge.source] + edge.weight < distance[edge.destination]) {

                    distance[edge.destination] =
                            distance[edge.source] + edge.weight;
                }
            }
        }

        // Check Negative Cycle

        for (Edge edge : edges) {

            if (distance[edge.source] != Integer.MAX_VALUE &&
                    distance[edge.source] + edge.weight < distance[edge.destination]) {

                System.out.println("Negative Weight Cycle Found");

                return;
            }
        }

        System.out.println("Shortest Distance");

        for (int i = 0; i < vertices; i++) {

            System.out.println(source + " -> " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0,1,-1));
        edges.add(new Edge(0,2,4));
        edges.add(new Edge(1,2,3));
        edges.add(new Edge(1,3,2));
        edges.add(new Edge(1,4,2));
        edges.add(new Edge(3,2,5));
        edges.add(new Edge(3,1,1));
        edges.add(new Edge(4,3,-3));

        bellmanFord(edges, vertices, 0);
    }
}
