
import java.util.*;
class Main {
  public static List<Integer>majorityElement(int[]nums){
      int cand1=0,cand2=0,count1=0,count2=0;
      
      for(int num:nums){
          if(num==cand1){
              count1++;
          }else if(num==cand2){
              count2++;
          }else if(count1==0){
              cand1=num;
              count1=1;
          }else if(count2==0){
              cand2=num;
              count2=1;
          }else{
              count1--;
              count2--;
          }
      }
      count1=0;
      count2=0;
      
      for(int num:nums){
          if(cand1==num) count1++;
          if(cand2==num) count2++;
      }
       List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(cand1);
        if (count2 > n / 3) result.add(cand2);

        return result;
  }
    public static void main(String[] args) {
        int[]nums={3,2,3};
     System.out.println(majorityElement(nums));
    }
}
