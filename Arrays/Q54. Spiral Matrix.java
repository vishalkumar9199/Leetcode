class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer>result=new ArrayList<>();
         int r=matrix.length;
        int c=matrix[0].length;

        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElement=0;

        while(totalElement < r*c){
            //topRow->leftcol to rightcol
            for(int j=leftCol;j<=rightCol && totalElement < r*c;j++){
                result.add(matrix[topRow][j]);
                totalElement++;
            }
            topRow++;
            // rightcol->toprow to bottomrow
            for(int i=topRow;i<=bottomRow && totalElement < r*c;i++){
                result.add(matrix[i][rightCol]);
                totalElement++;
            }
            rightCol--;
            // bottomcol=>rightcol to leftcol
            for(int j=rightCol;j>=leftCol && totalElement < r*c ;j--){
                result.add(matrix[bottomRow][j]);
                totalElement++;
            }
            bottomRow--;
            // leftcol->bottomRow to toprow
            for(int i=bottomRow;i>=topRow && totalElement < r*c;i--){
                result.add(matrix[i][leftCol]);
                totalElement++;
            }
            leftCol++;
        }
        return result;
        
    }
}
