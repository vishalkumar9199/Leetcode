import java.util.Arrays;

public class bubbleSort {
    public static void BubbleSort(int[]arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]nums={2,1,8,3,5,12,9,56,19,200};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    
}
