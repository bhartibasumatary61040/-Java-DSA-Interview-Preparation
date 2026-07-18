package org.java.graphs;
import java.util.*;
public class FloydWarshall {

    static final int INF = 99999;

    public static void main(String[] args) {

        int[][] graph = {

                {0,5,INF,10},

                {INF,0,3,INF},

                {INF,INF,0,1},

                {INF,INF,INF,0}
        };

        int vertices = graph.length;

        int[][] distance = new int[vertices][vertices];

        for (int i = 0; i < vertices; i++)
            distance[i] = graph[i].clone();

        for (int k = 0; k < vertices; k++) {

            for (int i = 0; i < vertices; i++) {

                for (int j = 0; j < vertices; j++) {

                    if (distance[i][k] + distance[k][j] < distance[i][j]) {

                        distance[i][j] =
                                distance[i][k] + distance[k][j];
                    }
                }
            }
        }

        System.out.println("Shortest Distance Matrix");

        for (int i = 0; i < vertices; i++) {

            for (int j = 0; j < vertices; j++) {

                if (distance[i][j] == INF)
                    System.out.print("INF ");

                else
                    System.out.print(distance[i][j] + " ");
            }

            System.out.println();
        }
    }
}
