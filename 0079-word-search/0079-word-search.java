class Solution {
    boolean[][] used;
    int r;
    int c;
    public boolean exist(char[][] board, String word) {
        r = board.length;
        c=board[0].length;
        used = new boolean[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0)){
                    if(DFS(board,word,i,j,0)) return true;
                }
            }
        }
        return false;

    }

    private boolean DFS(char[][] board, String word, int i, int j, int ind){
        if(word.length()== ind) return true;
        if(i<0|| i>=r || j<0 || j>=c || used[i][j] || board[i][j] !=word.charAt(ind)) return false;
        used[i][j]=true;
        if(DFS(board,word,i-1,j,ind+1)|| DFS(board,word,i+1,j,ind+1) || DFS(board,word,i,j-1,ind+1) || DFS(board,word,i,j+1,ind+1)) return true;
        used[i][j]=false;
        return false;
    }
}