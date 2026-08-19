class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int max=0;
        int idx=-1;
        
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;
            int firstOneIdx = m; 
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[i][mid] == 1) {
                    firstOneIdx = mid; 
                    high = mid - 1;    
                } else {
                    low = mid + 1;     
                }
            }

            int onesCount = m - firstOneIdx;
            if (onesCount > max) {
                max = onesCount;
                idx = i;
            }
        }
         return idx;
        // for(int temp[] : arr){
        //     int low =0;
        //     int high=m-1;
        //     int ans=0;
        //     while(low<=high){
        //         int mid=low+(high-low)/2;
        //         if(temp[mid]>=1){
        //             ans=mid;
        //             high=mid-1;
        //         }else{
        //             low=mid+1;
        //         }
        //     }
        //     if(m-ans > max){
        //         max=m-ans;
        //         idx=i;
        //     }
        //     i++;
        // }
       
    }
};