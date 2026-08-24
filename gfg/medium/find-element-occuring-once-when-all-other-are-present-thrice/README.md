# Unique Number III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers  **arr[]**  where, every element  **appears**   **thrice** except for one which  **occurs**   **once**.
Find that element which  **occurs**   **once**.

 **Examples:** 

```
Input: arr[] = [1, 10, 1, 1]
Output: 10
Explanation: 10 occurs once in the array while the other element 1 occurs thrice.

```

```
Input: arr[] = [3, 2, 1, 34, 34, 1, 2, 34, 2, 1]
Output: 3
Explanation: All elements except 3 occurs thrice in the array.
```

**Constraints:
**1 ≤ arr.size() ≤ 105
arr.size() % 3 = 1
-109 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T01:13:10.432Z  

```java
class Solution {
    public int getSingle(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap();
        for(int n : arr)
            map.put(n,map.getOrDefault(n,0)+1);
        for(int n: arr)
            if(map.get(n)==1)
                return n;
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-element-occuring-once-when-all-other-are-present-thrice/1)