class Solution {
    public static int firstDigit(int n) {
        // code here
        return n/(int)Math.pow(10,(int)Math.log10(n));
    }
}