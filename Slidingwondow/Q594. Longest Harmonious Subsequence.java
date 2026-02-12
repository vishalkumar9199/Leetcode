// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int harmonius(int[]nums){
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxlen=0;
        
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                int currlen=map.get(key)+map.get(key+1);
                maxlen=Math.max(maxlen,currlen);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[]nums={1,3,2,2,5,2,3,7};
        System.out.println(harmonius(nums));
    }
}
