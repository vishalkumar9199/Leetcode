class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]<nums[stack.peek()] && stack.size()+nums.length-i>k){
                stack.pop();
            }
            if(stack.size()<k){
                stack.push(i);
            }
        }
        int i=k;
        int[]res=new int[k];
        while(!stack.isEmpty()){
            res[--i]=nums[stack.pop()];
        }
        return res;
    }
}
