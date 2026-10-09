# M-Coloring Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an undirected graph consisting of  **V**  vertices and  **E**  edges represented by a list  **edges[][]**, along with an integer  **m**. Your task is to find if it is possible to color the graph using at most m different colors such that no two adjacent vertices share the same color. 

 **Note:**  The graph is indexed with 0-based indexing.

 **Examples:** 

```
Input: V = 4, edges[][] = [[0, 1], [1, 3], [2, 3], [3, 0], [0, 2]], m = 3
Output: true
Explanation: It is possible to color the given graph using 3 colors, for example, one of the possible ways vertices can be colored as follows:

Vertex 0: Color 1
Vertex 1: Color 2
Vertex 2: Color 2
Vertex 3: Color 3

```

```
Input: V = 3, edges[][] = [[0, 1], [1, 2], [0, 2]], m = 2
Output: false
Explanation: It is not possible to color the given graph using only 2 colors because vertices 0, 1, and 2 form a triangle.
```

 **Constraints:** 
1 ≤ V ≤ 10
1 ≤ E = edges.size() ≤ (V*(V-1))/2
0 ≤ edges[i][j] ≤ V-1
1 ≤ m ≤ V

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T01:32:33.873Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1)