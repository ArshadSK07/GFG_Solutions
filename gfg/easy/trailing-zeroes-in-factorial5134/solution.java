class Solution {
    public static int trailingZeroes(int n) {
        // code here
        int cnt =0;
        while(n>=5){
            cnt+=n/5;
            n/=5;
        }
        return cnt;
        
        // long  fact=1;
        // for(int i=1;i<=n;i++)
        //     fact*=i;
        // int cnt=0;
        // while(fact%10==0)
        // {
        //     cnt++;
        //     fact/=10;
        // }
        // return cnt;
    }
}