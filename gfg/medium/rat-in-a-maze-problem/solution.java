class Solution {
    public static void func(int i,int j,int[][] mat,ArrayList<String> ans,String list,boolean [][] vis){
        if(i==mat.length-1 && j== mat[0].length-1){
            ans.add(list);
            return;
        }
        // down
        if(i+1<mat.length && vis[i+1][j]==false && mat[i+1][j]==1){
            vis[i][j]=true;
            func(i+1,j,mat,ans,list+"D",vis);
            vis[i][j]=false;
        }
        // left
        if(j-1>=0 &&vis[i][j-1]==false && mat[i][j-1]==1 ){
            vis[i][j]=true;
            func(i,j-1,mat,ans,list+"L",vis);
            vis[i][j]=false;
        }
        // right
        if(j+1<mat[0].length && vis[i][j+1]==false && mat[i][j+1]==1){
            vis[i][j]=true;
            func(i,j+1,mat,ans,list+"R",vis);
            vis[i][j]=false;
        }
        // up
        if(i-1>=0 &&vis[i-1][j]==false && mat[i-1][j]==1){
            vis[i][j]=true;
            func(i-1,j,mat,ans,list+"U",vis);
            vis[i][j]=false;
        }
    } 
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        
        boolean [][] vis = new boolean[maze.length][maze[0].length];
        String list="";
        ArrayList<String> ans = new ArrayList();
        if(maze[0][0] == 0 || maze[maze.length-1][maze[0].length-1]==0) return ans;
        func(0,0,maze,ans,list,vis);
        return ans;
    }
}