// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static double findMaxAverage(int[] nums, int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum=sum;
        int left=0;
        int right=k;
        
        while(right<nums.length){
            sum-=nums[left];
            left++;
            
            sum+=nums[right];
            right++;
            
            maxSum=Math.max(sum,maxSum);
        }
        return (double)maxSum/k;
        
    }
    
    public static void main(String[] args) {
         int[]num={1,12,-5,-6,50,};
        int k=4;
        
        System.out.println(findMaxAverage(num,k));
    }
}
