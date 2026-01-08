// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
     public static int maxsubarraySum(int[]nums,int k){
         Map<Integer,Integer>map= new HashMap<>();
         int prefixSum=0;
         int res=0;
         for(int i=0;i<nums.length;i++){
             prefixSum+=nums[i];
             
             if(map.containsKey(prefixSum-k)){
                 res=Math.max(res,i-map.get(prefixSum-k));
             }
             if(!map.containsKey(prefixSum-k)){
                 map.put(prefixSum,i);
             }
         }
         return res;
      
     }
    public static void main(String[] args) {
        int[]num={5,2,2,5,1,1,1,1,-9};
        int k=4;
        
        System.out.println(maxsubarraySum(num,k));
    }
}
