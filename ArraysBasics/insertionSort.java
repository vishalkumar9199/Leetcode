import java.util.Arrays;

public class insertionSort {
    public static void insertionsort(int[]arr) {
    	for(int i=1;i<arr.length;i++) {
    		 int temp=arr[i];
    		 int j=i-1;
    		    while(j>-1 && temp<arr[j]) {
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
    		 
    	}
    }
    public static void main(String[] args) {
          int[]nums={2,1,8,3,5,12,9,56,19,200};
        insertionsort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
