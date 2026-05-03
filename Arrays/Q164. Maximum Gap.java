class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        int maxdiff=0;
        for(int i=1;i<nums.length;i++){
            maxdiff=Math.max(maxdiff,Math.abs(nums[i])-Math.abs(nums[i-1]));
        }
        return maxdiff;
        
    }
}
