# Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two non-empty strings  **s1** and  **s2**, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

 **Examples:** 

```
Input: s1 = "geeks" s2 = "kseeg"
Output: true 
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
```

```
Input: s1 = "allergy", s2 = "allergyy" 
Output: false 
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. 
```

```
Input: s1 = "listen", s2 = "lists" 
Output: false 
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T01:00:37.479Z  

```java
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!= s2.length()) return false;
        int []freqs1 = new int [26];
        int [] freqs2 = new int [26];
        for(int i=0;i<s1.length();i++){
            freqs1[s1.charAt(i)-'a']++;
            freqs2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
            if(freqs1[i]!=freqs2[i])
                return false;
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/anagram-1587115620/1)