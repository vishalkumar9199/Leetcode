import java.util.*;
public class MatrixTranpose {
    public static  void Transpose(int[][]matrix){
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        Transpose(matrix);
        System.err.println(Arrays.deepToString(matrix));
        
    }
    
}
