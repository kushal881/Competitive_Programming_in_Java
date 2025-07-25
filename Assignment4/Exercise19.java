package Assignment4;

import java.util.*;

public class Exercise19 {

    public static int[] shortestPath(int V, List<List<Integer>> adj, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, -1);
        Queue<Integer> queue = new LinkedList<>();

        dist[src] = 0;
        queue.offer(src);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : adj.get(node)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    queue.offer(neighbor);
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        int[] result = shortestPath(V, adj, 0);

        System.out.println("Shortest distances from node 0:");
        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + ": " + result[i]);
        }
    }
}

