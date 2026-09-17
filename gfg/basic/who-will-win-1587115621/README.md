# Binary Search

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[],** sorted in ascending order and an integer  **k**. Return true if k is present in the array, otherwise, false.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: true
Exlpanation: Since, 6 is present in the array at index 4 (0-based indexing), output is true.
```

```
Input: arr[] = [1, 2, 4, 5, 6], k = 3
Output: false
Exlpanation: Since, 3 is not present in the array, output is false.
```

```
Input: arr[] = [2, 3, 5, 6], k = 1
Output: false1 ≤ arr[i] ≤ 106
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T01:05:27.739Z  

```java
class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k) return true;
            else if(arr[mid]>k) high=mid-1;
            else    low=mid+1;
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1)