
import java.util.Arrays;

public class sum_of_Array {
    public static void ReverseArray(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        
    }
    public static void main(String[] args) {
    //     int[]nums={1,2,5,9,10};
    //     int sum=0;
    //     for(int i=0;i<nums.length;i++){
    //         sum+=nums[i];
    //     }
    //     System.out.println("The Sum of Array is:"+sum);

    int[]arr={1,2,3,4};
    ReverseArray(arr);
    System.out.println(Arrays.toString(arr));
    }
    
}
