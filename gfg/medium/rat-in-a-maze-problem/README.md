# Rat in a Maze

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary matrix  **maze[][]**  of size **n × n**  containing values  **0**  and  **1**, find all possible paths for a rat to travel from the source cell (0, 0) to the destination cell (n - 1, n - 1). The rat can move in four directions: up(U), down(D), left(L), and right(R).

- 1 represents an open cell through which the rat can move.
- 0 represents a blocked cell that cannot be traversed.

The rat can move only through open cells and cannot visit the same cell more than once in a path. Return all valid paths as strings consisting of 'U', 'D', 'L', and 'R', representing the sequence of moves taken by the rat.

 **Note:**  Return the paths in lexicographically increasing order. If no valid path exists, return an empty list.

 **Examples:** 

```
Input: maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}
Output: ["DDRDRR", "DRDDRR"]
Explanation: There are two valid paths from the source cell (0, 0) to the destination cell (3, 3).

```

```
Input: maze[][] = [[1, 0], [1, 0]]
Output: []
Explanation: No path exists as the destination cell (1, 1) is blocked.

```

 **Constraints:** 
2 ≤ n ≤ 5
0 ≤ maze[i][j] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T01:39:52.398Z  

```java
class Solution {
    public static void func(int i,int j,int[][] mat,ArrayList<String> ans,String list,boolean [][] vis){
        if(i==mat.length-1 && j== mat[0].length-1){
            ans.add(list);
            return;
        }
        // down
        if(i+1<mat.length && vis[i+1][j]==false && mat[i+1][j]==1){
            vis[i][j]=true;
            func(i+1,j,mat,ans,list+"D",vis);
            vis[i][j]=false;
        }
        // left
        if(j-1>=0 &&vis[i][j-1]==false && mat[i][j-1]==1 ){
            vis[i][j]=true;
            func(i,j-1,mat,ans,list+"L",vis);
            vis[i][j]=false;
        }
        // right
        if(j+1<mat[0].length && vis[i][j+1]==false && mat[i][j+1]==1){
            vis[i][j]=true;
            func(i,j+1,mat,ans,list+"R",vis);
            vis[i][j]=false;
        }
        // up
        if(i-1>=0 &&vis[i-1][j]==false && mat[i-1][j]==1){
            vis[i][j]=true;
            func(i-1,j,mat,ans,list+"U",vis);
            vis[i][j]=false;
        }
    } 
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        
        boolean [][] vis = new boolean[maze.length][maze[0].length];
        String list="";
        ArrayList<String> ans = new ArrayList();
        if(maze[0][0] == 0 || maze[maze.length-1][maze[0].length-1]==0) return ans;
        func(0,0,maze,ans,list,vis);
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1)