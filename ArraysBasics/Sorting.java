import java.util.Arrays;

public class Sorting {
    //BubbleSort
    public static void BubbleSort(int[]nums){
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    //SelectionSort
    public static void SelectionSort(int[]nums){
        for(int i=0;i<nums.length;i++){
            int minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }
            while(i!=minIndex){
                int temp=nums[i];
                nums[i]=nums[minIndex];
                nums[minIndex]=temp;
            }
        }
    }
    //InsertionSort
    public static void InsertionSort(int[]nums){
        for(int i=1;i<nums.length;i++){
            int temp=nums[i];
            int j=i-1;

            if(j>-1 && nums[j]>temp){
                nums[j+1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[]nums={2,6,4,1,9,3};
        BubbleSort(nums);
        System.out.println("BubbleSot:->"+Arrays.toString(nums));
        SelectionSort(nums);
        System.out.println("SelectionSort:->"+Arrays.toString(nums));
        InsertionSort(nums);
        System.out.println("InsertionSort:->"+Arrays.toString(nums));
        
    }
    
}
