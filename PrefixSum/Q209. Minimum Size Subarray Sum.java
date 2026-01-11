class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0;
        int curr=0;
        int ans=Integer.MAX_VALUE;

        while(right<nums.length){
            curr+=nums[right];

            while(curr>=target){
                ans=Math.min(ans,right-left+1);
                curr-=nums[left];
                left++;
            }
            right++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
