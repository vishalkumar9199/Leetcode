class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        //reverse whole array
        reverse(nums,0,n-1);
        //reverse first k element
        reverse(nums,0,k-1);
        //reverse remaing array
        reverse(nums,k,n-1);
    }
    public void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
    }
}
