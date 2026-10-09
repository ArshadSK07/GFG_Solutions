class Solution {
    static boolean isSafe(int node, boolean[][] adj, int[] col, int v, int colr) {
        for (int neighbor = 0; neighbor < v; neighbor++) {
            // Check if there is an edge and if the neighbor has the same color
            if (adj[node][neighbor] && col[neighbor] == colr) {
                return false;
            }
        }
        return true;
    }

    static boolean func(int node, boolean[][] adj, int[] col, int v, int m) {
        if (node == v) return true;

        for (int i = 1; i <= m; i++) {
            if (isSafe(node, adj, col, v, i)) {
                col[node] = i;
                if (func(node + 1, adj, col, v, m)) return true;
                col[node] = 0; // Backtrack
            }
        }
        return false;
    }

    boolean graphColoring(int v, int[][] edges, int m) {
        // Build Adjacency Matrix using a 2D boolean array
        boolean[][] adj = new boolean[v][v];
        for (int[] edge : edges) {
            adj[edge[0]][edge[1]] = true;
            adj[edge[1]][edge[0]] = true;
        }

        int[] col = new int[v];
        return func(0, adj, col, v, m);
    }
}