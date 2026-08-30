# Trailing zeroes in factorial

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

For an integer  **n,**  find the number of trailing zeroes in  **n!.** 

 **Examples :** 

```
Input: n = 5
Output: 1
Explanation: 5! = 120 so the number of trailing zero is 1.
```

```
Input: n = 4
Output: 0
Explanation: 4! = 24 so the number of trailing zero is 0.
```

 **Constraints:** 
1 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T01:23:23.218Z  

```java
class Solution {
    public static int trailingZeroes(int n) {
        // code here
        int cnt =0;
        while(n>=5){
            cnt+=n/5;
            n/=5;
        }
        return cnt;
        
        // long  fact=1;
        // for(int i=1;i<=n;i++)
        //     fact*=i;
        // int cnt=0;
        // while(fact%10==0)
        // {
        //     cnt++;
        //     fact/=10;
        // }
        // return cnt;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1)