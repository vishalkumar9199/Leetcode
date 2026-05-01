class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:nums){
            if(map.get(num)==1){
                return num;
            }
        }
        return 0;
        
    }
}
