
import java.util.HashSet;

public class RemoveDuplicate {
    public static String removeduplicates(String s){
       StringBuilder sb = new StringBuilder();
      HashSet<Character>set=new HashSet<>();

      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

        if(!set.contains(ch)){
            set.add(ch);
            sb.append(ch);
        }

      }
       return sb.toString();
    }
    public static void main(String[] args) {
        String s="programming";
        System.out.println(removeduplicates(s));
    }
    
}
