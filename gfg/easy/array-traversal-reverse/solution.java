class Solution {
    public static void arrayTraversalReverse(int[] arr, int n) {
        // Code here
        int i=arr.length-1;
        while(i>=0){
            System.out.print(arr[i]+" ");
            i--;
        }
    }
}
