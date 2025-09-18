
public class q1 {
	public static int MaxSubArray(int[]nums) {
		int max_sum=nums[0];
		int curr_Sum=nums[0];
		
		for(int i=1;i<nums.length;i++) {
			curr_Sum=Math.max(nums[i],curr_Sum+nums[i]);
			max_sum=Math.max(curr_Sum, max_sum);
		}
		return max_sum;
	}

	public static void main(String[] args) {
	
		 int[]nums={-2,-5,6,-2,-3,1,5,-6};
	        System.out.println(MaxSubArray(nums));
	}

}
