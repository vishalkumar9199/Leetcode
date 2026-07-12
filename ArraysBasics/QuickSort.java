import java.util.Arrays;

public class QuickSort {
    public static void swap(int[]arr,int frirstIndex,int lastIndex){
        int temp=arr[frirstIndex];
        arr[frirstIndex]=arr[lastIndex];
        arr[lastIndex]=temp;
    }
    public static int Pivot(int[]arr,int pivotIndex,int endIndex){
        int swapIndex=pivotIndex;
        for(int i=pivotIndex+1;i<=endIndex;i++){
            if(arr[i]<arr[pivotIndex]){
                swapIndex++;
                swap(arr,swapIndex,i);
            }
        }
        swap(arr,pivotIndex,swapIndex);
        return swapIndex;
    }
    public static void quickSort(int[]arr,int left,int right){
        if(left<right){
            int pivotIndex=Pivot(arr, left, right);
            quickSort(arr, left, pivotIndex-1);
            quickSort(arr, pivotIndex+1, right);
        }
    }

    public static void main(String[] args) {
        int[]arr={8,6,4,1,90,45,3,17,45,18};
        quickSort(arr, 0, 9);
        System.err.println(Arrays.toString(arr));
        
    }
}
