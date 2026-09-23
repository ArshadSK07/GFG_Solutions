# Last Digit of Number

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer **n**  **.** Write a program to print the last digit of n **.** 

 **Examples:** 

```
Input: n = 10
Output: 0
```

```
Input: n = 9768
Output: 8

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T09:18:45.849Z  

```java
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=1;
        if(n<0)
            f=-1;
        System.out.println(f*(n%10));
        // code here
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/last-digit-of-a-number--145429/1)