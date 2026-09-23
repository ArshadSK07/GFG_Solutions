# Disarium Number

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number **n**, find if it is Disarium or not.

A number is called a Disarium number if the sum of its digits raised to the power of their respective positions is equal to the number itself.

 **Examples:** 

```
Input: 89
Output: true
Explanation: 81 + 92 = 8 + 81 = 89, which is equal to n. Therefore, 89 is a Disarium Number, so output is true.
```

```
Input: 81
Output: false
Explanation: 81 + 12 = 8 + 1 = 9, which is not equal to n. Therefore, 81 is not a Disarium Number, so output is false.
```

 **Constraints:** 
0 <= n <= 108

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T09:39:28.873Z  

```java
class Solution {
    public boolean isDisarium(int n) {
        // code here
        int temp=n;
        int t=(int)Math.pow(10,(int)Math.log10(n));
        int sum=0;
        int cnt=0;
        while(temp>0){
            cnt++;
            sum+=Math.pow(temp/t,cnt);
            temp%=t;
            t/=10;
        }
        return sum==n;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/disarium-number1045/1)