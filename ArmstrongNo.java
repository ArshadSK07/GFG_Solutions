class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp1=n;
        int temp=0;
        while(n>0){
            int d=n%10;
            temp+=(int)Math.pow(d,3);
            n/=10;
        }
        
        return temp==temp1;
    }
}