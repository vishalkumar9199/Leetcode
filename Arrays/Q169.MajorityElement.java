class Solution {
    public int majorityElement(int[] nums) {
        //moore's voting algorithm
        int majority=nums[0],votes=1;

        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            }else if(majority==nums[i]){
                votes++;
            }else{
                votes--;
            }
        }
        return majority;
    }
}

//using hashmap

 HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            
            // Check if count > n/2
            if (map.get(num) > n / 2) {
                return num;
            }
        }
        
        // Since majority element always exists, we never reach here.
        return -1;
}

//
