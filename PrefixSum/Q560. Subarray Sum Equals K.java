// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
     public static int subarraySum(int[]nums,int k){
       Map<Integer,Integer>map=new HashMap<>();
       map.put(0,1);
       int prefixSum=0;
       int res=0;
       
       for(int num:nums){
           prefixSum+=num;
           
           if(map.containsKey(prefixSum-k)){
               res+=map.get(prefixSum-k);
           }
           map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
       }
       return res;
     }
    public static void main(String[] args) {
        int[]num={1,1,1};
        int k=2;
        
        System.out.println(subarraySum(num,k));
    }
}
