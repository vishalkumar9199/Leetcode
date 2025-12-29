class Solution {
    public int[] nextGreaterElements2(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>(); // will store values (could store indices too)

        for(int i=(2*n)-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i%n]>=stack.peek()){
                stack.pop();
            }
            if(i<n){
                nge[i]=stack.isEmpty()?-1:stack.peek();
            }
            stack.push(nums[i%n]);
        }
        return nge;
    }
}
