import java.util.*;
class Main {
    public static int maxfruits(int[]fruits){
        Map<Integer,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        int maxfruit=0;
        
        for(right=0;right<nums.length;right++){
            int currcount=map.getOrDefault(fruits[right],0);
            map.put(fruits[right],currcount+1);
            
            while(map.size()>2){
                int fruitcount=map.get(fruits[left]);
                if(fruitcount==1){
                    map.remove(fruits[left]);
                }else
                map.put(fruits[left],fruitcount-1);
                left++;
            }
            maxfruit=Math.max(maxfruit,right-left+1);
        }
        return maxfruit;
    }
    public static void main(String[] args) {
        int[]fruits={1,2,3,2,2};
        System.out.println(maxfruits(fruits));
    }
}
