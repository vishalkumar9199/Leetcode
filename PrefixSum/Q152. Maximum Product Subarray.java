class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
       int leftproduct=1;
       int rightproduct=1;
       int res=nums[0];

       for(int i=0;i<n;i++){
        leftproduct=leftproduct==0?1:leftproduct;
        rightproduct=rightproduct==0?1:rightproduct;

        leftproduct*=nums[i];
        rightproduct*=nums[n-1-i];

        res=Math.max(res,Math.max(leftproduct,rightproduct));
       }
       return res;

    }
}
