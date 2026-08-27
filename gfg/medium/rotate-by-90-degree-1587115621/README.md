# Rotate by 90 degree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a square matrix  **mat** [][] of size  **n x n**. The task is to rotate it by **90 degrees**  in an **anti-clockwise**  direction without using any extra space. 

 **Examples:** 

```
Input: mat[][] = [[0, 1, 2], 
                [3, 4, 5], 
                [6, 7, 8]] 
Output: [[2, 5, 8],
        [1, 4, 7],
        [0, 3, 6]]
```

```
Input: mat[][] = [[1, 2],
                [3, 4]]
Output: [[2, 4],
        [1, 3]]

```

 **Constraints:** 
1 ≤ n ≤ 102
0 ≤ mat[i][j] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T01:24:34.080Z  

```java
class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        // trans pose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        // reverse ecah cloumn
        for(int k=0;k<n;k++){
            int i=0;
            int j=n-1;
            while(i<j){
                int temp=mat[i][k];
                mat[i][k]=mat[j][k];
                mat[j][k]=temp;
                i++;
                j--;
            }
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1)