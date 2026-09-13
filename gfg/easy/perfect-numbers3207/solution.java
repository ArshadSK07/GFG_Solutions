class Solution {
    static boolean isPerfect(int n) {
        // code here
        long sum=1;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                sum+=i;
                if(n/i!=i)
                    sum+=n/i;
            }
        }
        return n==sum;
                
    }
};