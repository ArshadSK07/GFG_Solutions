# Row with Max 1s in Rowwise Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a 2D binary array `arr[][]` consisting of only `1`s and `0`s. Each row of the array is sorted in non-decreasing order. Your task is to find and return the index of the first row that contains the maximum number of `1`s. If no such row exists, return `-1`.

 **Note:** 

- The array follows 0-based indexing.
- The number of rows and columns in the array are denoted by n.

 **Examples:** 

```
Input: arr[][] = [[0,1,1,1],
               [0,0,1,1],
               [1,1,1,1],
               [0,0,0,0]]
Output: 2
Explanation: Row 2 contains the most number of 1s (4 1s). Hence, the output is 2.
```

```
Input: arr[][] = [[0,0],
               [1,1]]
Output: 1
Explanation: Row 1 contains the most number of 1s (2 1s). Hence, the output is 1.
```

```
Input: arr[][] = [[0,0], 
               [0,0]]
Output: -1
Explanation: No row contains any 1s, so the output is -1.
```

 **Constraints:** 
1 ≤ arr.size(), arr[i].size() ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T01:04:02.827Z  

```java
class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int max=0;
        int idx=-1;
        
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;
            int firstOneIdx = m; 
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[i][mid] == 1) {
                    firstOneIdx = mid; 
                    high = mid - 1;    
                } else {
                    low = mid + 1;     
                }
            }

            int onesCount = m - firstOneIdx;
            if (onesCount > max) {
                max = onesCount;
                idx = i;
            }
        }
         return idx;
        // for(int temp[] : arr){
        //     int low =0;
        //     int high=m-1;
        //     int ans=0;
        //     while(low<=high){
        //         int mid=low+(high-low)/2;
        //         if(temp[mid]>=1){
        //             ans=mid;
        //             high=mid-1;
        //         }else{
        //             low=mid+1;
        //         }
        //     }
        //     if(m-ans > max){
        //         max=m-ans;
        //         idx=i;
        //     }
        //     i++;
        // }
       
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1)