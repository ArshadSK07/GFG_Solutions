class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int  i=0;
        int j=0;
        int cnt=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(cnt==k-1) return a[i];
                cnt++;
                i++;
            }else{
                if(cnt==k-1)return b[j];
                j++;
                cnt++;
            }
        }
        while(i<a.length){
            if(cnt==k-1) return a[i];
            cnt++;
            i++;
        }
        while(j<b.length){
            if(cnt==k-1)return b[j];
            j++;
            cnt++;
        }
        return -1;
    }
}