import java.util.*;
public class IsomorphicString{
    public static boolean isomorphicString(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char replace=t.charAt(i);

            if(!map.containsKey(original)){
                if(!map.containsValue(replace)){
                    map.put(original,replace);
                }else{
                    return false;
                }
            }else{
                char ch=map.get(original);
                if(ch!=replace){
                    return false;
                }
            }
           
        }

           return true;
    }

    public static void main(String[] args) {
        String s="egg";
        String t="addt";

        System.out.println(isomorphicString(s, t));
    }
}
