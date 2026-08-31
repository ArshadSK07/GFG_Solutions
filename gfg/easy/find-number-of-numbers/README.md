# Count a Digit in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**. Your task is to return an integer denoting the total number of times digit k appears in the array.

 **Examples:** 

```
Input: k = 1, arr[] = [11, 12, 13, 14, 15]
Output: 6 
Explanation: Here, digit 1 appears in the whole array 6 times.

```

```
Input: k = 3, arr[] = [11, 121, 15]
Output: 0 
Explanation: Here, digit 3 appears in the whole array 0 times.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 20
1 ≤ arr[i] ≤ 1000
1≤ k ≤ 9

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T01:59:34.559Z  

```java
class Solution {
    public static int countDigitK(int k, int arr[]) {
        // code here
        int cnt=0;
        for(int n : arr){
            while(n>0){
                if(n%10 == k) 
                    cnt++;
                n/=10;
            }
        }
        return cnt;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-number-of-numbers/1)