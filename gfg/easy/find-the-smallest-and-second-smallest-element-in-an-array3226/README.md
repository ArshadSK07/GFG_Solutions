# First and Second Smallests

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array,  **arr[]**  of integers, your task is to return the  **smallest**  and  **second smallest**  element in the array. If the smallest and second smallest do not exist, return  **-1.** 

 **Examples:** 

```
Input: arr[] = [2, 4, 3, 5, 6]
Output: [2, 3] 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
```

```
Input: arr[] = [1, 1, 1]
Output: [-1]
Explanation: Only element is 1 which is smallest, so there is no second smallest element.
```

 **Constraints:** 
1 ≤ arr.size ≤105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T01:38:29.076Z  

```java
class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int n : arr){
            if(n<min1){
                min2=min1;
                min1=n;
            }
            if(n>min1 && n<min2){
                min2=n;
            }
        }
        ArrayList<Integer> ans =new ArrayList();
        if(min1==Integer.MAX_VALUE || min2==Integer.MAX_VALUE)
        {
            ans.add(-1);
            return ans;
        }
        ans.add(min1);
        ans.add(min2);
        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1)