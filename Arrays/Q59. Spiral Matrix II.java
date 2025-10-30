class Solution {
    public int[][] generateMatrix(int n) {
        int[][]matrix=new int[n][n];
         int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int current=1;

        while(current<=n*n){
            //topRow->leftcol to rightcol
            for(int j=leftCol;j<=rightCol && current<=n*n;j++){
                matrix[topRow][j]=current++;
                
            }
            topRow++;
            // rightcol->toprow to bottomrow
            for(int i=topRow;i<=bottomRow && current<=n*n;i++){
                matrix[i][rightCol]=current++;
                
            }
            rightCol--;
            // bottomcol=>rightcol to leftcol
            for(int j=rightCol;j>=leftCol && current<=n*n ;j--){
                matrix[bottomRow][j]=current++;
                
            }
            bottomRow--;
            // leftcol->bottomRow to toprow
            for(int i=bottomRow;i>=topRow && current<=n*n;i--){
                matrix[i][leftCol]=current++;
                
            }
            leftCol++;
        }
        return matrix;
    }
}
