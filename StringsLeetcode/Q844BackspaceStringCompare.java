import java.util.*;
public class Q844BackspaceStringCompare{
    public static boolean BackspaceStringCompare(String s,String t){
        return build(s).equals(build(t));
    }


    private static String build(String s){
        Stack<Character>stack= new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
         String s = "ab#c";
      String t = "ad#c";
      System.out.println(BackspaceStringCompare(s, t));
    }
}
