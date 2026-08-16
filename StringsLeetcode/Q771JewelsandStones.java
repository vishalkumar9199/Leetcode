import java.util.*;
public class Q771JewelsandStones{
    public static int JewelsandStones(String jewels,String stones){
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();

        for(char ch:stones.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:jewels.toCharArray()){
            if(map.containsKey(ch)){
                count+=map.get(ch);
            }
        }
        return count;
    }
    public static void main(String[] args) {
         String jewels = "aA"; 
         String stones = "aAAbbbb";

         System.out.println(JewelsandStones(jewels, stones));
    }

}