// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
   public static int pivotIndex(int[]nums){
       int rightSum=0;
       for(int num:nums){
           rightSum+=num;
       }
       int leftSum=0;
       
       for(int i=0;i<nums.length;i++){
           rightSum-=nums[i];
           
           if(leftSum==rightSum){
               return i;
           }
           leftSum+=nums[i];
       }
       return -1;
   }
    public static void main(String[] args) {
        int[]nums={1,7,3,6,5,6};
        // int k=2;
        System.out.println(pivotIndex(nums));
    }
}
