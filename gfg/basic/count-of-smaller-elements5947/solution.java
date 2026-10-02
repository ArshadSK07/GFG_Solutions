
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int cnt=0;
        for(int n : arr){
            if(n<=x) cnt++;
        }
        return cnt;
    }
}