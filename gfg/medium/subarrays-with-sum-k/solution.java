class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer,Integer> map= new HashMap();
        map.put(0,1);
        int ans=0;
        int sum=0;
        for(int n : arr){
            sum+=n;
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}