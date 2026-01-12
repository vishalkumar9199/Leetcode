class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int currSum=0;
        int minLenWindow=Integer.MAX_VALUE;

        while(right<nums.length){
            currSum+=nums[right];
            right++;
        
            while(currSum>=target){
                int currWindowLen=right-left;
                minLenWindow=Math.min(minLenWindow,currWindowLen);

                currSum-=nums[left];
                left++;
            }
        }
        return minLenWindow==Integer.MAX_VALUE?0:minLenWindow;


        
    }
}
