class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        generate(0,nums,new ArrayList<>(),res);
        return res;
    }
    private void generate(int index,int[]nums,ArrayList<Integer>current,List<List<Integer>>res){
        res.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            generate(i+1,nums,current,res);
            current.remove(current.size()-1);
        }
    }

    

    
}
