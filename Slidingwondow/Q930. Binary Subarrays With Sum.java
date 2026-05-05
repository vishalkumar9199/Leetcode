//prefixSum
class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
         Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefixSum=0;
        int res=0;

        for(int num:nums){
            prefixSum+=num;

            if(map.containsKey(prefixSum-k)){
                res+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return res;
        
    }
}
