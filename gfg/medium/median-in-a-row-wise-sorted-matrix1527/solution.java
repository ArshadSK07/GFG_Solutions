class Solution {
    public int upperbound(int [] arr , int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int blackbox(int [][] mat , int x){
        int cnt=0;
        for(int arr[] : mat){
            cnt+=upperbound(arr,x);
        }
        return cnt;
    }
    public int median(int[][] mat) {
        // code here
        int low=1;
        int high=2000;
        int req=(mat.length*mat[0].length)/2;
        while(low<=high){
            int mid=(low+high)/2;
            if(blackbox(mat,mid)<=req)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
}