# Subsequence with Sum K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  and target sum **k**, check if there exists a subsequence such that the sum of all elements in the subsequence equals to k.

 **Examples:** 

```
Input: arr = [10, 1, 2, 7, 6, 1, 5], k = 8.
Output: true
Explanation: Subsequences like [2, 6], [1, 7] sum upto 8

```

```
Input: arr = [2, 3, 5, 7, 9], k = 100. 
Output: false
Explanation: No subsequence can sum upto 10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T01:31:54.667Z  

```java
class Solution {
    public static boolean func(int idx,int sum,int k,int[] arr){
        if(sum>k) return false;
        if(idx==arr.length){
            if(sum==k)  return true;
            return false;
        }
        sum+=arr[idx];
        if(func(idx+1,sum,k,arr)==true) return true;
        sum-=arr[idx];
        if(func(idx+1,sum,k,arr)==true) return true;
        return false;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        return func(0,0,k,arr);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-there-exists-a-subsequence-with-sum-k/1)