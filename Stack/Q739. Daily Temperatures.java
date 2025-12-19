class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>stack= new Stack<>();
        int n=temp.length;
        int[]result=new int[n];

        for(int idx=n-1;idx>=0;idx--){

            while(!stack.isEmpty() && temp[idx]>=temp[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[idx]=stack.peek()-idx;
            }
            stack.push(idx);
        }
        return result;
        
    }
}
