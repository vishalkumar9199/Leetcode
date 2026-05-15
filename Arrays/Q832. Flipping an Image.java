class Solution {
    public static void flip(int[] arr) 
    {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) 
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
         int n = image.length;
        for(int i=0;i<n;i++)
        {   
            flip(image[i]); // Flip
            for(int j=0;j<n;j++)
                image[i][j] = (image[i][j] == 1) ? 0 : 1; // Invert
        }   
        return image;
        
    }
}
