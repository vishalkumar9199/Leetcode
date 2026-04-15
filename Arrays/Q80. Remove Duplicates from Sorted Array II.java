class Solution {
    public int removeDuplicates(int[] nums) {

        Map<Integer,Integer>map=new HashMap<>();
        int k=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)<=2){
                nums[k++]=num;
            }
        }
        return k;

    }
}
