class Solution {
    public static int reverse(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+(num%10);
            num/=10;
        }
        return rev;
    }
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int ele : arr){
            int rev=reverse(ele);
            if(ele!=rev) return false;
        }
        return true;
    }
}