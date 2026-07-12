import java.util.Arrays;

public class addOfTwoMatrix {
    public static int[][] addMatrix(int[][]m1,int[][]m2){
        int row=m1.length;
        int col=m1[0].length;
        int[][]res=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][]m1={{1,2,3},{4,5,6},{7,8,9}};
        int[][]m2={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(addMatrix(m1, m2)));
        
    }
}
