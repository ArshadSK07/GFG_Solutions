class Solution {
    public boolean search(int[] nums, int target) {
        // code here
        int low=0;
                int high=nums.length-1;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(nums[mid]==target)  
                        return true;
                    if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                        low+=1;
                        high-=1;
                        continue;
                    }
                    if(nums[low] <= nums[mid]){
                        if(target >=nums[low] && target <=nums[mid])
                            high=mid-1;
                        else
                            low=mid+1;
                    }else{
                        if(target >= nums[mid] && target <= nums[high])
                            low=mid+1;
                        else
                            high=mid-1;
                    }
                }

                return false;

        // int low=0;
        // int high=arr.length-1;
        // while(low<=high){
        //     int mid=low-(high-low)/2;
        //     if(arr[mid]==key) return true;
        //     if(arr[low]==arr[mid] && arr[mid]==arr[high]) {
        //         low+=1;
        //         high-=1;
                    // continue;
        //     }
        //     if(arr[low]<=arr[mid]){
        //         if(key >= arr[low] && key<=arr[mid])
        //             high=mid-1;
        //         else
        //             low=mid+1;
        //     }else{
        //         if(key>=arr[mid] && key <=arr[high])
        //             low=mid+1;
        //         else{
        //             high=mid-1;
        //         }
        //     }
        // }
        // return false;
    }
}
