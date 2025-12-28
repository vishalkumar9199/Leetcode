// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
       public static boolean jumpgame(int[]nums){
           int finalposition=nums.length-1;
           for(int i=nums.length-2;i>=0;i--){
               if(i+nums[i]>=finalposition){
                   finalposition=i;
               }
           }
           return finalposition==0;
       }
    public static void main(String[] args) {
        int[]arr={2,3,1,1,4};
       
        System.out.println(jumpgame(arr));
    }
}
