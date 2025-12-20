class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        int[] nextGreater = new int[nums2.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            // remove all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            // assign answer
            if (stack.isEmpty())
                nextGreater[i] = -1;
            else
                nextGreater[i] = stack.peek();

            // push current element
            stack.push(element);
        }
         int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[i] =  nextGreater[j];
                    break;
                }
            }
        }

        return ans;
    }
}

    //Mine solution with 1 arrays input
import java.util.*;
public class q1 {
	public static int[]nextgreaterElement(int[]arr){
		Stack<Integer>stack=new Stack<>();
		int[]res=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			int val=arr[i];
			while(!stack.isEmpty() && val>=stack.peek()) {
				stack.pop();
			}
			if(!stack.isEmpty()) {
				res[i]=stack.peek();
			}else {
				res[i]=-1;
			}
			stack.push(val);
		}
		return res;
	}


	public static void main(String[] args) {	
		int[]num= {1,3,4,2};
		int[]ans=nextgreaterElement(num);
		System.out.println(Arrays.toString(ans));
		
		
		
	}
}

