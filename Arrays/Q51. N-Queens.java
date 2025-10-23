// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void nqueen(char[][]board,int row){
        int n=board.length;
        if(row==n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
               System.out.println();
            }
            System.out.println();
            return;
            
        }
        for(int j=0;j<n;j++){
            if(isValid(board,row,j)){
                board[row][j]='Q';
                nqueen(board,row+1); //Recursion
                board[row][j]='x'; //Backtracking
            }
        }
    }
    public static  boolean isValid(char[][]board,int row,int col){
        int n=board.length;
        //check row
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        //check col
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        // check northeast
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //check southeast
        
        i=row;
        j=col;
        while(i<n && j<n){
             if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        // check sothwest
         i=row;
        j=col;
        while(i<n && j>=0){
             if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        // check northwest
          i=row;
        j=col;
        while(i>=0 && j>=0){
             if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    
   
}
    
    public static void main(String[] args) {
        int n=4;
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nqueen(board,0);
    }
    
}
