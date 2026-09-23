class Solution {
    public boolean isDisarium(int n) {
        // code here
        int temp=n;
        int t=(int)Math.pow(10,(int)Math.log10(n));
        int sum=0;
        int cnt=0;
        while(temp>0){
            cnt++;
            sum+=Math.pow(temp/t,cnt);
            temp%=t;
            t/=10;
        }
        return sum==n;
    }
}