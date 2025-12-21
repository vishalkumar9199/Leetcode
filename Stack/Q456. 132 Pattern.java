class Solution {
    public boolean find132pattern(int[] nums) {
       

        Stack<Integer>stack = new Stack<>();
        int secHigh=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<secHigh) return true;

            while(!stack.isEmpty() && nums[i]>stack.peek()){
                // secHigh=Math.max(secHigh,stack.peek());
                // stack.pop();
                secHigh = stack.pop();
            }
            stack.push(nums[i]);
            
        }
        return false;
        

         // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i]<nums[k] && nums[k]<nums[j]){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
    }
}
