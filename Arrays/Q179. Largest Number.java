// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static String largestNumber(int[] nums){
        String[]array=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            array[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(array,(a,b)->(b+a).compareTo(a+b));
        if(array[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<array.length;i++){
            sb.append(array[i]);
        }
        return sb.toString();
        
    } 
    public static void main(String[] args) {
        int[]nums={10,2};
        System.out.println(largestNumber(nums));
    }
}
