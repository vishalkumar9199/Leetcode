// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
   public static int maxProduct(int[] nums){
       int n=nums.length;
       int leftprod=1;
       int rightprod=1;
       int res=nums[0];
       
       for(int i=0;i<n;i++){
           leftprod=leftprod==0?1:leftprod;
           rightprod=rightprod==0?1:rightprod;
           
           leftprod*=nums[i];
           rightprod*=nums[n-1-i];
           
           res=Math.max(res,Math.max(leftprod,rightprod));
       }
       return res;
       
   }
    public static void main(String[] args) {
        int[]nums={2,3,-2,4};
        // int k=2;
        System.out.println(maxProduct(nums));
    }
}
