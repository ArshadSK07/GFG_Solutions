class Solution {
    public static int countDigitK(int k, int arr[]) {
        // code here
        int cnt=0;
        for(int n : arr){
            while(n>0){
                if(n%10 == k) 
                    cnt++;
                n/=10;
            }
        }
        return cnt;
    }
}