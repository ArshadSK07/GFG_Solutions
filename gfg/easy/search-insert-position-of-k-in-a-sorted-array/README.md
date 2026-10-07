# Sorted Insert Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array  **arr[]** (0-index based) of distinct integers and an integer  **k**, find the index of k if it is present in the arr[]. If not, return the index where k should be inserted to maintain the sorted order.

 **Examples :** 

```
Input: arr[] = [1, 3, 5, 6], k = 5
Output: 2
Explanation: Since 5 is found at index 2 as arr[2] = 5, the output is 2.
```

```
Input: arr[] = [1, 3, 5, 6], k = 2
Output: 1
Explanation: The element 2 is not present in the array, but inserting it at index 1 will maintain the sorted order.
```

```
Input: arr[] = [2, 6, 7, 10, 14], k = 15
Output: 5
Explanation: The element 15 is not present in the array, but inserting it after index 4 will maintain the sorted order.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T07:00:09.152Z  

```java
class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=k) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1)