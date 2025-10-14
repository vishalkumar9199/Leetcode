class Solution {
    public boolean isValid(char[][]board,int row,int col,char num){
        //check row
        for(int j=0;j<9;j++){
            if(board[row][j]==num)return false;
        }
        //check
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        int Srow=row/3*3;
        int Scol=col/3*3;
        for(int i=Srow;i<Srow+3;i++){
            for(int j=Scol;j<Scol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;

    }
    public boolean isValidSudoku(char[][] board) {
       
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                char num=board[i][j];
                board[i][j]='.';
                if(isValid(board,i,j,num)==false) return false;
                board[i][j]=num;
            }
        }
        return true;
    }
}
