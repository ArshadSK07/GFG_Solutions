class Solution {
    public static boolean isprime(int n){
        for(int i=2;i<=(n/2);i++)
            if(n%i==0) return false;
        return true;
    }
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        for(int i=n+1;;i++){
            if(isprime(i)==true)
                return i;
        }
        // return -1;
    }
}