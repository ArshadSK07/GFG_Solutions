# Subarrays with Sum K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an unsorted array  **arr[]**  of integers, find the number of subarrays whose sum exactly equal to a given number k.

 **Examples:** 

```
Input: arr[] = [10, 2, -2, -20, 10], k = -10
Output: 3
Explanation: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.
```

```
Input: arr[] = [9, 4, 20, 3, 10, 5], k = 33
Output: 2
Explanation: Subarrays: arr[0...2], arr[2...4] have sum exactly equal to 33.

```

```
Input: arr[] = [1, 3, 5], k = 0
Output: 0
Explanation: No subarray with 0 sum.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T13:33:44.325Z  

```java
class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer,Integer> map= new HashMap();
        map.put(0,1);
        int ans=0;
        int sum=0;
        for(int n : arr){
            sum+=n;
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k/1)