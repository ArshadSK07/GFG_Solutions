# Search in Rotated Array 2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted and rotated array  **arr[]**  and a target  **key**. Check whether the key is present in the array or not.

 **Note:**  The array may contains duplicate elements.

 **Examples:** 

```
Input: arr[] = [3, 3, 3, 1, 2, 3], key = 3
Output: true
Explanation: 3 is present in the array.
```

```
Input: arr[] = [4, 5, 8, 1, 1, 1, 2], key = 6
Output: false
Explanation: 6 is not present in the array.
```

 **Constraints** :
1 ≤ arr.size() ≤ 106
0 ≤ arr[i], key ≤ 108

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T01:55:14.972Z  

```java
class Solution {
    public boolean search(int[] arr, int key) {
        // code here
        // int low=0;
        //         int high=nums.length-1;
        //         while(low<=high){
        //             int mid=low+(high-low)/2;
        //             if(nums[mid]==target)  
        //                 return true;
        //             if(nums[low] == nums[mid] && nums[mid] == nums[high]){
        //                 low+=1;
        //                 high-=1;
        //                 continue;
        //             }
        //             if(nums[low] <= nums[mid]){
        //                 if(target >=nums[low] && target <=nums[mid])
        //                     high=mid-1;
        //                 else
        //                     low=mid+1;
        //             }else{
        //                 if(target >= nums[mid] && target <= nums[high])
        //                     low=mid+1;
        //                 else
        //                     high=mid-1;
        //             }
        //         }

        //         return false;

        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key) return true;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]) {
                low+=1;
                high-=1;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(key >= arr[low] && key<=arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }else{
                if(key>=arr[mid] && key <=arr[high])
                    low=mid+1;
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-rotated-array-2/1)