# Missing Element in Range

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array arr[] of integers and a range [low, high], find all the numbers within the range that are not present in the array. return the missing numbers in sorted order.

 **Examples:** 

```
Input: arr[] = [10, 12, 11, 15], low = 10, high = 15
Output: [13, 14]
Explanation: Numbers 13 and 14 lie in the range [10, 15] but are not present in the array.

```

```
Input: arr[] = [1, 4, 11, 51, 15], low = 50, high = 55
Output: [50, 52, 53, 54, 55]
Explanation: Numbers 50, 52, 53, 54 and 55 lie in the range [50, 55] but are not present in the array.

```

**Constraints:
**1 ≤ arr.size(), low, high ≤ 105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T01:26:06.940Z  

```java
class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
                ArrayList<Integer> ans = new ArrayList<>();
                HashSet<Integer> set = new HashSet<>();
                for (int ele : arr) {
                    set.add(ele);
                }
                for (int i = low; i <= high; i++) {
                    if (!set.contains(i)) {
                        ans.add(i);
                    }
                }

                return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/missing-element-in-range/1)