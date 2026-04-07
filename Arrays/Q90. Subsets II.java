class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        generate(0,nums,new ArrayList<>(),res);
        return res;
    }
    private void generate(int index,int[]nums,List<Integer>current,List<List<Integer>>res){
       
        res.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            current.add(nums[i]);
            generate(i+1,nums,current,res);
            current.remove(current.size()-1);
        }
    }
}
