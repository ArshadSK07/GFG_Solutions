class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int oddcnt=0;
        int evencnt=0;
        for(int n : arr){
            if(n%2==0)
                evencnt++;
            else
                oddcnt++;
        }
        int [] res=new int [2];
        res[0]=oddcnt;
        res[1]=evencnt;
        return res;
    }
}