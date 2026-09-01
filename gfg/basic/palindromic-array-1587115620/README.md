# Array with All Palindromes

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  of positive integers. Return true if all the array elements are palindrome otherwise, return false.

 **Examples:** 

```
Input: arr[] = [111, 222, 333, 444, 555]
Output: true
Explanation:
arr[0] = 111, which is a palindrome number.
arr[1] = 222, which is a palindrome number.
arr[2] = 333, which is a palindrome number.
arr[3] = 444, which is a palindrome number.
arr[4] = 555, which is a palindrome number.
As all numbers are palindrome so This will return true.
```

```
Input: arr[] = [121, 131, 20]
Output: false
Explanation: 20 is not a palindrome hence the output is false.

```

 **Constraints:** 
1 <=arr.size<= 20
1 <=arr[i]<= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T00:57:01.489Z  

```java
class Solution {
    public static int reverse(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+(num%10);
            num/=10;
        }
        return rev;
    }
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int ele : arr){
            int rev=reverse(ele);
            if(ele!=rev) return false;
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1)