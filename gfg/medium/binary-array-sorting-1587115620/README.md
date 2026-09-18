# Binary Array Sorting

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a binary array  **arr[]**, where each element is either  **0** or  **1**. Your task is to rearrange the array in increasing order in place (without using extra space). You do not need to return anything; simply modify the input array.

 **Examples:** 

```
Input: arr[] = [1, 0, 1, 1, 0]
Output: [0, 0, 1, 1, 1]
Explanation: After arranging the elements in increasing order, elements will be as 0 0 1 1 1.
```

```
Input: arr[] = [1, 0, 1, 1, 1, 1, 1, 0, 0, 0]
Output: [0, 0, 0, 0, 1, 1, 1, 1, 1, 1]
Explanation: After arranging the elements in increasing order, elements will be 0 0 0 0 1 1 1 1 1 1.
```

```
Input: arr[] = [1, 1, 1, 1]
Output: [1, 1, 1, 1]
Explanation: Since the array already contains only 1s, no change is needed.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
for all valid indices  **i**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T01:14:10.686Z  

```java
class Solution {
    public void binSort(int[] arr) {
        // code here
        int i=0;
        int j=0;
        int n=arr.length;
        while(j<arr.length){
            while(j<n && arr[j]==1) j++;
            if(j<n){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
                i++;
            }
            // i++;
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1)