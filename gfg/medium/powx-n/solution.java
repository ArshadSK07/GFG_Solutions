class Solution {
    double power(double x, int n) {
        // code here
        if(n==0)
            return 1;
        double ans=1.0;
        int nn = n;
        if(nn<0)
            nn=-1*nn;
        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn--;
            }else{
                x=x*x;
                nn/=2;
            }
        }
        if(n<0) return 1.0/ans;
        return ans;
    }
}