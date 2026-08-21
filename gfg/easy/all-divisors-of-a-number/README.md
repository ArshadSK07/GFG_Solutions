# All Divisors of a Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n,**  return all the divisors of n in the  **ascending** order.
 
 **Examples:** 

```
Input : n = 20
Output: 1 2 4 5 10 20
Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.

```

```
Input: n = 21191
Output: 1 21191
Explanation: As 21191 is a prime number, it has only 2 factors(1 and the number itself).
```

 **Constraints:** 
1 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T10:50:19.204Z  

```java
class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> li = new ArrayList<>();

        // Iterate only up to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                li.add(i); // i is a divisor
                if (i != n / i) {
                    li.add(n / i); // n / i is the corresponding pair divisor
                }
            }
        }

        // Ensure divisors are returned in sorted order
        Collections.sort(li);
        return li;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/all-divisors-of-a-number/1)