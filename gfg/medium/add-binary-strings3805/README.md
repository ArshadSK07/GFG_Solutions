# Add Binary Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two binary strings **s1**  and  **s2**  consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
 **Note:** The input strings may contain leading zeros but the output string should not have any leading zeros.

```
Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100

```

```
Input: s1 = "00100", s2 = "010"
Output: 110
Explanation: 
 100
+ 10
 110

```

 **Constraints:** 
1 ≤s1.size(), s2.size()≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T00:47:28.491Z  

```java
class Solution {
    public String addBinary(String a, String b) {
        // code here
        int i=a.length()-1;
                int j=b.length()-1;
                StringBuilder sb=new StringBuilder();
                // convert two strings into character array
                char [] as=a.toCharArray();
                char [] bs=b.toCharArray();
                char carry='0';
                while(i>=0 && j>=0){
                    int sum=as[i]-'0'+bs[j]-'0'+carry-'0';
                    if(sum==0){
                        carry='0';
                        sb.append('0');
                    }else if(sum==1){
                        carry='0';
                        sb.append('1');
                    }else if(sum==2){
                        carry='1';
                        sb.append('0');
                    }else{
                        carry='1';
                        sb.append('1');
                    }
                    i--;
                    j--;
                }
                while(i>=0){
                    int sum=as[i]-'0'+carry-'0';
                    if(sum==0){
                        carry='0';
                        sb.append('0');
                    }else if(sum==1){
                        carry='0';
                        sb.append('1');
                    }else if(sum==2){
                        carry='1';
                        sb.append('0');
                    }else{
                        carry='1';
                        sb.append('1');
                    }
                    i--;
                }
                while(j>=0){
                    int sum=bs[j]-'0'+carry-'0';
                    if(sum==0){
                        carry='0';
                        sb.append('0');
                    }else if(sum==1){
                        carry='0';
                        sb.append('1');
                    }else if(sum==2){
                        carry='1';
                        sb.append('0');
                    }else{
                        carry='1';
                        sb.append('1');
                    }
                    j--;
                }
                if(carry=='1') sb.append('1');
                String result = sb.reverse().toString();

                // Remove leading zeros as required by the problem
                int start = 0;
                while (start < result.length() - 1 && result.charAt(start) == '0') {
                    start++;
                }

                return result.substring(start);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/add-binary-strings3805/1)