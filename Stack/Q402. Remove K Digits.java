// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static String removeKdigits(String num, int k){
       Stack<Character>stack=new Stack<>();
       for(int i=0;i<num.length();i++){
           char ch =num.charAt(i);
           while(!stack.isEmpty() && k>0 && ch<stack.peek()){
               stack.pop();
               k--;
           }
           stack.push(ch);
       }
       //conversion
       StringBuilder sb = new StringBuilder();
       while(!stack.isEmpty()){
           if(k>0){
               stack.pop();
               k--;
           }else{
               sb.insert(0,stack.pop());
           }
       }
       while(sb.length()>0 && sb.charAt(0)=='0'){
           sb.deleteCharAt(0);
       }
        return (sb.length()==0)?"0":sb.toString();
    }
       
    public static void main(String[] args) {
        String s ="1432219";
        System.out.println(removeKdigits(s,3));
        
    }
}
