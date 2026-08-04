
import java.util.HashSet;

public class FindDuplicate{
    //for sorted array;
    public static int FindDuplicateNo(int[]nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
    //using Binary search
    public static int findDuplicate(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == nums[mid + 1]) {
            return nums[mid];
        }

        // Expected index of nums[mid]
        if (nums[mid] > mid + 1) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }

    return -1;
}
//for unsorted array
public static int findDuplicateUnsorted(int[]nums){
    HashSet<Integer>set=new HashSet<>();
    for(int num:nums){
        if(set.contains(num)){
            return num;
        }
        set.add(num);

   }
   return -1;
}
    public static void main(String[] args) {
        int[]nums={1,3,4,2,2};
        System.out.println(FindDuplicateNo(nums));

         int[] num = {3, 1, 4, 2, 5, 3};
        System.out.println(findDuplicateUnsorted(num));
        
    }
}
