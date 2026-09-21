# powx-n

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T01:53:54.130Z  

```java
class Solution {
    double power(double x, int n) {
        // code here
        if(n==0)
            return 1;
        double ans=1.0;
        int nn = n;
        if(nn<0)
            nn=-1*nn;
        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn--;
            }else{
                x=x*x;
                nn/=2;
            }
        }
        if(n<0) return 1.0/ans;
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/powx-n/1)