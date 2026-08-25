# Sum of Middle of two sorted arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two sorted integer arrays  **arr1[]**  and  **arr2[]** of the same size. Find the sum of the middle elements of two sorted arrays arr1 and arr2.

 **Examples:** 

```
Input: arr1[] = [1, 2, 4, 6], arr2[] = [4, 5, 6, 9]
Output: 9
Explanation: The merged array looks like [1, 2, 4, 4, 5, 6, 6, 9,]. Sum of middle elements is 9 (4 + 5).

```

```
Input: arr1[] = [1, 12, 15, 26, 38], arr2[] = [2, 13, 17, 30, 45]
Output: 32
Explanation: The merged array looks like [1, 2, 12, 13, 15, 17, 26, 30, 38, 45]. Sum of middle elements is 32 (15 + 17).
```

 **Constraints:** 
1 ≤ arr1.size() == arr2.size() ≤ 103
1 ≤ arr1[i] ≤ 106
1 ≤ arr2[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T01:14:44.301Z  

```java
class Solution {
    public int findMidSum(int[] arr1, int[] arr2) {
        // code here
        List<Integer> li = new ArrayList();
        for (int num : arr1) {
            li.add(num);
        }
        for (int num : arr2) {
            li.add(num);
        }
        Collections.sort(li);
        return li.get(li.size()/2)+li.get((li.size()/2)-1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1)