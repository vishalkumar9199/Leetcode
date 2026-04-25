class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (seen.contains(n)) {
                return true;  // duplicate found
            }
            seen.add(n);
        }
        return false;
        
    }
}
