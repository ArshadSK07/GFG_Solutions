# Palindrome String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, return  **true**  if the string is a  **palindrome**. Otherwise, return  **false**.

A string is considered a palindrome if it reads the same forwards and backwards.

 **Examples :** 

```
Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
```

```
Input: s = "abc" 
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
```

 **Constraints:** 
1 ≤ s.size() ≤ 106
The string `s` contains only lowercase english letters (a-z).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:21:04.256Z  

```java
class Solution {
    boolean isPalindrome(String s) {
        // code here
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome-string0817/1)