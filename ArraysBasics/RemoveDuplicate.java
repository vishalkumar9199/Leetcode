import java.util.Arrays;

public class RemoveDuplicate {
    //remove RemoveDuplicate from sorted array;
    public static int[] RemoveDuplicates(int[]nums){
        if (nums.length == 0) return new int[0];

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
       return Arrays.copyOf(nums, i);
    }
    public static void main(String[] args) {
        int[]nums={1,1,2,2,7,9,1,1};
        System.out.println(Arrays.toString(RemoveDuplicates(nums)));
        
    }
    
}
