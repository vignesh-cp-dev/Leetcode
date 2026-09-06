import java.util.*;
class Solution {
        public boolean isSafe(int row,int col,char[][] board,int n){ 

        // Upper diagonal 
        int duprow=row; 
        int dupcol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;

        }

        //Lower diagonal
        row=duprow;
        col=dupcol;
        while(row<n && col>=0){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
//Check left
row=duprow;
col=dupcol;
while(col>=0){
    if(board[row][col]=='Q') return false;
    col--;
}
 return true;  
 } 
public List<List<String>> ans=new ArrayList<>();
public void solve(int col,char[][] board,List<List<String>> ans,int n){
 if(col==n){
    List<String> temp=new ArrayList<>();
    for(int i=0;i<n;i++){
        temp.add(new String(board[i]));
    }
    ans.add(temp);
    return;
 }
for(int row=0;row<n;row++){
  if(isSafe(row,col,board,n)){
    board[row][col]='Q';
    solve(col+1,board,ans,n);
    board[row][col]='.';
  }
}
}
    public List<List<String>> solveNQueens(int n) {
    char[][] board=new char[n][n];
    for(int i=0;i<n;i++){
    Arrays.fill(board[i],'.');
    }
    solve(0,board,ans,n);
    return ans;
    }
}