class Solution {
    public int convertFive(int n) {
        // code here
        if(n==0) return 5;
        int ans=0;
        int t=(int)Math.pow(10,(int)Math.log10(n));
        while (t > 0) {
                    int digit = n / t;
                    if (digit == 0) {
                        ans = (ans * 10) + 5;
                    } else {
                        ans = (ans * 10) + digit;
                    }
                    n %= t;
                    t /= 10;
                }
        return ans;
    }
}