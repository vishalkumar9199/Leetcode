import java.util.*;
public class combinationalSum {
    public static List<List<Integer>>combinational(int[]nums,int target){
         Arrays.sort(nums);
         List<List<Integer>>result=new ArrayList<>();
        backtrack(nums,target,result,new ArrayList<>(),0);
         return result;
    }
    private static  void backtrack(int[]nums,int remianing,List<List<Integer>>result,List<Integer>current,int start){
        if(remianing==0){
            result.add(new ArrayList<>(current));
        }else if(remianing<0){
            return;
        }

        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(nums, remianing-nums[i], result, current, start);
            current.remove(current.size()-1);
        }
    }
    
    public static void main(String[] args) {
        int[]nums={2,3,6,7};
        int target=7;
        System.out.println(combinational(nums, target));
    }
    
}
