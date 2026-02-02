// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int maxSumSubArray(int[]nums,int k){
        int n=nums.length;
        if(n<k) return -1;
        int currSum=0;
        
        for(int i=0;i<k;i++){
            currSum+=nums[i];
        }
        int maxSum=currSum;
        
        for(int i=k;i<n;i++){
            currSum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
        
       
    }
    public static void main(String[] args) {
       int[]nums={-2,-5,6,4,3,8,-1,0,9};
       int k=4;
       System.out.println(maxSumSubArray(nums,k));
    }
}
