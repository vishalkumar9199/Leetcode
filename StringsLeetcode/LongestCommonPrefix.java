import java.util.*;
public class LongestCommonPrefix{
    public static String longestcommonString(String[]str){
        StringBuilder sb = new  StringBuilder();
        Arrays.sort(str);
        char[]left=str[0].toCharArray();
        char[]right=str[str.length-1].toCharArray();

        for(int i=0;i<right.length;i++){
             if(left[i]!=right[i]){
                break;
             }else{
                sb.append(left[i]);

             }
        }
        return sb.toString();


    }
   public static void main(String[] args) {
    String[]str={"flower","fly","fll"};
    System.out.println(longestcommonString(str));
    
   }
}