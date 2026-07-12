
import java.util.HashMap;

public class findDuplicatecharacter{

    public static void main(String[] args) {
        String s="abhifmahbi";
        HashMap<Character,Integer>map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char ch:map.keySet()){
            if(map.get(ch)>1){
                System.out.print(ch+" ");
            }
        }
        
    }
}