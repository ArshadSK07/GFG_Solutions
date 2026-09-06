# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given a string  **`s`**, and your task is to reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

 **Constraints:** 
1 <= s.size() <= 106
s contains only alphabetic characters (both uppercase and lowercase).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T03:54:15.039Z  

```java
class Solution {
    public static String reverseString(String s) {
        // code here
        char [] str = s.toCharArray();
        int i=0;
        int j=str.length-1;
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return new String(str);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)