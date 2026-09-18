class Solution {
    public void binSort(int[] arr) {
        // code here
        int i=0;
        int j=0;
        int n=arr.length;
        while(j<arr.length){
            while(j<n && arr[j]==1) j++;
            if(j<n){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
                i++;
            }
            // i++;
        }
    }
}
