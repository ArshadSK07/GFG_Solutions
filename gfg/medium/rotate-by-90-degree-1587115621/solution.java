class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        // trans pose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        // reverse ecah cloumn
        for(int k=0;k<n;k++){
            int i=0;
            int j=n-1;
            while(i<j){
                int temp=mat[i][k];
                mat[i][k]=mat[j][k];
                mat[j][k]=temp;
                i++;
                j--;
            }
        }
    }
}