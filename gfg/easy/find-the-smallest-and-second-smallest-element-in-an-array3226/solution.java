class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int n : arr){
            if(n<min1){
                min2=min1;
                min1=n;
            }
            if(n>min1 && n<min2){
                min2=n;
            }
        }
        ArrayList<Integer> ans =new ArrayList();
        if(min1==Integer.MAX_VALUE || min2==Integer.MAX_VALUE)
        {
            ans.add(-1);
            return ans;
        }
        ans.add(min1);
        ans.add(min2);
        return ans;
    }
}
