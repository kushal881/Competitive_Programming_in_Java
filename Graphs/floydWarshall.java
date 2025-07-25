package Graphs;

import java.util.*;

import java.util.*;

class FloydWarshall {
    static final int INF = 99999;
    static final int V = 4;

    static void printSolution(int dist[][]) {
        System.out.println("Shortest distances between every pair of vertices:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF)
                    System.out.print("INF\t");
                else
                    System.out.print(dist[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void floydWarshall(int graph[][]) {
        int dist[][] = new int[V][V];

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        printSolution(dist);
    }

    public static void main(String[] args) {
        int graph[][] = {
                {0, INF, 15, 40, INF},
                {INF, 0, INF, 25, 60},
                {15, INF, 0, 10,INF},
                {40, 25, 10, 0, 30},
                {INF, 60, INF, 30, 0}
        };

        floydWarshall(graph);
    }
}

