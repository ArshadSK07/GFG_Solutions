class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n=arr.length;
        return arr.length%2==1?arr[arr.length/2]:(arr[n / 2] + arr[n / 2 - 1]) / 2.0;
    }
}
