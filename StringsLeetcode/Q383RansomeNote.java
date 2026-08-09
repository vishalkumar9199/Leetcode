import java.util.*;
public class Q383RansomeNote{
    public static boolean canConstruct(String s,String t){
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }else{
                map.put(ch,map.get(ch)-1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="aa";
        String t="aad";
        System.out.println(canConstruct(s, t));
    }
}