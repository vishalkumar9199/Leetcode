// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int  minSubArrayLen(int[]nums,int tar){
       int left=0;
       int right=0;
       int currSum=0;
       int minWinlen=Integer.MAX_VALUE;
       
       while(right<nums.length){
           currSum+=nums[right];
           right++;
           
           while(currSum>=tar){
               int currwinlen=right-left;
               minWinlen=Math.min(currwinlen,minWinlen);
               
               currSum-=nums[left];
               left++;
               
           }
       }
       return minWinlen==Integer.MAX_VALUE?0:minWinlen;
        
        
    }
    public static void main(String[] args) {
         int[]num={2,3,1,2,4,3};
        int k=7;
        
        System.out.println( minSubArrayLen(num,k));
    }
}
