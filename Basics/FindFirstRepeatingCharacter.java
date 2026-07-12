
import java.util.*;

public class FindFirstRepeatingCharacter {
    public static char findfirst(String s){
        HashSet<Character>hs=new HashSet<>();

        for(char ch:s.toCharArray()){
            if(hs.contains(ch)){
                return ch;
            }
            hs.add(ch);

        }
       
        
        return ' ';
    }
    public static void main(String[] args) {
        String s="aabbcde";
        System.out.println(findfirst(s));
    }
    
}
