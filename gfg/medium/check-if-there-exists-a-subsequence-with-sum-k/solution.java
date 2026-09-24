class Solution {
    public static boolean func(int idx,int sum,int k,int[] arr){
        if(sum>k) return false;
        if(idx==arr.length){
            if(sum==k)  return true;
            return false;
        }
        sum+=arr[idx];
        if(func(idx+1,sum,k,arr)==true) return true;
        sum-=arr[idx];
        if(func(idx+1,sum,k,arr)==true) return true;
        return false;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        return func(0,0,k,arr);
    }
}