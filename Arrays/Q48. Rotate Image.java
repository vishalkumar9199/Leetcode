class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        transpose(matrix,row,col);

        for(int i=0;i<row;i++){
            reverse(matrix[i]);
        }

        
    }
    private void transpose(int[][]matrix,int row,int col){
        for(int i=0;i<col;i++){
            for(int j=i;j<row;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    } 
    private void reverse(int[]arr){
        int low=0,high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
