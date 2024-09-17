package Ads_42;

import java.util.*;

class CityMap {

    // Nested static class to represent an edge in the graph
    static class Edge {
        int destination; // Destination node
        int cableLength; // Length of the cable

        Edge(int destination, int cableLength) {
            this.destination = destination;
            this.cableLength = cableLength;
        }
    }

    // Depth-First Search function to explore all paths and find the longest cable
    static void DFS(List<Edge>[] graph, int src, int prevLen, int[] maxLen, boolean[] visited) {
        visited[src] = true; // Mark the current node as visited
        int currLen = 0; // Initialize the current length

        for (Edge adjacent : graph[src]) { // Traverse all adjacent nodes
            if (!visited[adjacent.destination]) { // If the adjacent node is not visited
                currLen = prevLen + adjacent.cableLength; // Update the current length
                DFS(graph, adjacent.destination, currLen, maxLen, visited); // Recursive DFS call
            }

            // Update the maximum cable length if the current path length is greater
            if (maxLen[0] < currLen) {
                maxLen[0] = currLen;
            }

            currLen = 0; // Reset current length for the next iteration
        }
    }

    // Function to find the longest cable length in the graph
    static int longestCable(List<Edge>[] graph, int n) {
        int[] maxLen = { Integer.MIN_VALUE }; // Array to store the maximum cable length

        // Perform DFS from each node to ensure we cover all possible paths
        for (int i = 1; i <= n; i++) {
            boolean[] visited = new boolean[n + 1]; // Initialize visited array for each start node
            DFS(graph, i, 0, maxLen, visited); // Call DFS
        }

        return maxLen[0]; // Return the maximum cable length found
    }

    public static void main(String[] args) {
        int n = 6; // Number of nodes in the graph
        List<Edge>[] graph = new ArrayList[n + 1]; // Initialize the graph as an adjacency list

        // Initialize each node's adjacency list
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[1].add(new Edge(2, 3));
        graph[2].add(new Edge(1, 3));
        graph[2].add(new Edge(3, 4));
        graph[3].add(new Edge(2, 4));
        graph[2].add(new Edge(6, 2));
        graph[6].add(new Edge(2, 2));
        graph[4].add(new Edge(6, 6));
        graph[6].add(new Edge(4, 6));
        graph[5].add(new Edge(6, 5));
        graph[6].add(new Edge(5, 5));

        // Calculate the maximum cable length
        int maxCableLength = longestCable(graph, n);
        System.out.println("Maximum length of cable = " + maxCableLength); // Output the result
    }
}
