import java.util.*;
public class findDuplicate {
    public static int finduplicate(int[]nums){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums={1,3,4,2,2};
        System.out.println(finduplicate(nums));
    }
}