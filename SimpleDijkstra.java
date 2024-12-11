import java.util.*;

public class SimpleDijkstra {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 4, 0}, // A -> B = 1, A -> C = 4
            {1, 0, 2, 6}, // B -> C = 2, B -> D = 6
            {4, 2, 0, 3}, // C -> D = 3
            {0, 6, 3, 0}  // D has no outgoing edges to A
        };

        int source = 0; // Start from node A (index 0)

        dijkstra(graph, source);
    }

    public static void dijkstra(int[][] graph, int source) {
        int n = graph.length; // Number of nodes
        int[] dist = new int[n]; // Stores shortest distances
        boolean[] visited = new boolean[n]; // Tracks visited nodes

        // Initialize distances as infinity and source distance as 0
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int i = 0; i < n - 1; i++) { // Loop to process all nodes
            int u = findMinDistance(dist, visited); // Get the closest unvisited node
            visited[u] = true; // Mark it as visited

            // Update distances for all neighbors of u
            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print the shortest distances
        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("To " + i + " -> " + dist[i]);
        }
    }

    // Helper function to find the unvisited node with the smallest distance
    public static int findMinDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
