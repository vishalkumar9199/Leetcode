import java.util.*;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = n, right = 0;
        Stack<Integer> stack = new Stack<>();

        // Find left boundary
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                left = Math.min(left, stack.pop());
            }
            stack.push(i);
        }

        stack.clear();

        // Find right boundary
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                right = Math.max(right, stack.pop());
            }
            stack.push(i);
        }

        return (right > left) ? (right - left + 1) : 0;
    }
}
