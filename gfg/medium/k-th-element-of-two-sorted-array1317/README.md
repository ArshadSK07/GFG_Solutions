# K-th element of two  Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two sorted arrays  **a[]** and  **b[]**  and an element  **k**, the task is to find the element that would be at the  **kth**  position of the combined sorted array.

 **Examples :** 

```
Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
Output: 6
Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.

```

```
Input: a[] = [1, 4, 8, 10, 12], b[] = [5, 7, 11, 15, 17], k = 6
Output: 10
Explanation: Combined sorted array is [1, 4, 5, 7, 8, 10, 11, 12, 15, 17]. The 6th element of this array is 10.
```

**Constraints:
**1 ≤ a.size(), b.size() ≤ 106
1 ≤ k ≤ a.size() + b.size()
0 ≤ a[i], b[i] ≤ 108

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T01:08:33.352Z  

```java
class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int  i=0;
        int j=0;
        int cnt=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(cnt==k-1) return a[i];
                cnt++;
                i++;
            }else{
                if(cnt==k-1)return b[j];
                j++;
                cnt++;
            }
        }
        while(i<a.length){
            if(cnt==k-1) return a[i];
            cnt++;
            i++;
        }
        while(j<b.length){
            if(cnt==k-1)return b[j];
            j++;
            cnt++;
        }
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1)