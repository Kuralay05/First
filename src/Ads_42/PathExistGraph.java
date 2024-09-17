package Ads_42;

import java.util.*;

public class PathExistGraph {

    // Static inner class to represent the graph
    static class Graph {
        private int vertices; // Number of vertices in the graph
        private List<List<Integer>> adjList; // Adjacency list to store edges

        // Constructor to initialize the graph with a given number of vertices
        public Graph(int vertices) {
            this.vertices = vertices;
            adjList = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                adjList.add(new ArrayList<>()); // Initialize adjacency list for each vertex
            }
        }

        // Method to add an edge between two vertices
        public void addEdge(int u, int v) {
            adjList.get(u).add(v); // Add edge from u to v
            adjList.get(v).add(u); // Add edge from v to u (undirected graph)
        }

        // Method to check if a path exists between two vertices using BFS
        public boolean isPathExist(int start, int end) {
            if (start == end) return true; // If start and end are the same, path exists

            boolean[] visited = new boolean[vertices]; // Array to keep track of visited vertices
            Queue<Integer> queue = new LinkedList<>(); // Queue for BFS
            queue.add(start); // Enqueue the start vertex
            visited[start] = true; // Mark the start vertex as visited

            while (!queue.isEmpty()) {
                int current = queue.poll(); // Dequeue a vertex

                for (int neighbor : adjList.get(current)) { // Iterate through adjacent vertices
                    if (neighbor == end) {
                        return true; // If end vertex is found, path exists
                    }
                    if (!visited[neighbor]) { // If the neighbor is not visited
                        visited[neighbor] = true; // Mark the neighbor as visited
                        queue.add(neighbor); // Enqueue the neighbor
                    }
                }
            }

            return false; // If BFS completes without finding the end vertex, path does not exist
        }
    }

    public static void main(String[] args) {
        int N = 5; // Number of vertices in the graph
        int[][] edges = { // Array of edges
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 3},
                {3, 4}
        };

        Graph graph = new Graph(N); // Create a new graph with N vertices

        // Add edges to the graph
        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }

        int U = 0; // Source vertex
        int V = 4; // Destination vertex

        // Check if a path exists between U and V
        if (graph.isPathExist(U, V)) {
            System.out.println("Yes"); // Output "Yes" if a path exists
        } else {
            System.out.println("No"); // Output "No" if a path does not exist
        }
    }
}
