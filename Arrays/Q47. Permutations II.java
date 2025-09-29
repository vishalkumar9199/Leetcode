class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
	        Arrays.sort(nums); // Sort to handle duplicates
	        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
	        return result;
	    }

	    private static void backtrack(int[] nums, boolean[] used, List<Integer> tempList, List<List<Integer>> result) {
	        if (tempList.size() == nums.length && !result.contains(tempList)) {
	            result.add(new ArrayList<>(tempList));
	            return;
	        }
	        for (int i = 0; i < nums.length; i++) {
	            if (used[i]) continue; // Skip used numbers
	           
	            
	            used[i] = true;
	            tempList.add(nums[i]);
	            backtrack(nums, used, tempList, result);
	            used[i] = false;
	            tempList.remove(tempList.size() - 1);
	        }
	    
       }
            
        }


    

