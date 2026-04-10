class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int left=0;
        int right=height.length-1;
        int left_max=0;
        int right_max=0;

        int ans=0;

        while(left<right){
            left_max=Math.max(left_max,height[left]);
            right_max=Math.max(right_max,height[right]);

            if(left_max<right_max){
                ans += left_max-height[left];
                left++;
            }else{
                ans += right_max-height[right];
                right--;
            }
        }
        return ans;
        
    }
}
