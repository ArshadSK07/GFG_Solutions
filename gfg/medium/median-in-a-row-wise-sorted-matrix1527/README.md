# Median in a Row-Wise Sorted Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a row-wise sorted matrix  **mat[][]**  of size  **n x m**, where the number of rows and columns is always  **odd**. Return the  **median**  of the matrix.

 **Examples:** 

```
Input: mat[][] = [[1, 3, 5], [2, 6, 9], [3, 6, 9]]
Output: 5
Explanation: Sorting matrix elements gives us [1, 2, 3, 3, 5, 6, 6, 9, 9]. Hence, 5 is median.

```

```
Input: mat[][] = [[2, 4, 9], [3, 6, 7], [4, 7, 10]]
Output: 6
Explanation: Sorting matrix elements gives us [2, 3, 4, 4, 6, 7, 7, 9, 10]. Hence, 6 is median.
```

```
Input: mat = [[3], [4], [8]]
Output: 4
Explanation: Sorting matrix elements gives us [3, 4, 8]. Hence, 4 is median.

```

 **Constraints:** 
1 ≤ n, m ≤ 400
1 ≤ mat[i][j] ≤ 2000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T03:06:43.493Z  

```java
class Solution {
    public int upperbound(int [] arr , int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int blackbox(int [][] mat , int x){
        int cnt=0;
        for(int arr[] : mat){
            cnt+=upperbound(arr,x);
        }
        return cnt;
    }
    public int median(int[][] mat) {
        // code here
        int low=1;
        int high=2000;
        int req=(mat.length*mat[0].length)/2;
        while(low<=high){
            int mid=(low+high)/2;
            if(blackbox(mat,mid)<=req)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1)