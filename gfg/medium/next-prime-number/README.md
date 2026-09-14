# Next Prime Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer **n**  **.** Write a program to find the first prime number greater than  **n.** 

 **Examples:** 

```
Input: n = 15
Output: 17
Explanation: 17 is next prime number.
```

```
Input: n = 7
Output: 11
Explanation: 11 is the prime number next to 7.
```

 **Constraints:** 
1 <= n <= 500

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T15:54:04.599Z  

```java
class Solution {
    public static boolean isprime(int n){
        for(int i=2;i<=(n/2);i++)
            if(n%i==0) return false;
        return true;
    }
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        for(int i=n+1;;i++){
            if(isprime(i)==true)
                return i;
        }
        // return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/next-prime-number/1)