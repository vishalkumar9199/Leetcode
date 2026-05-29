// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
     public static String removeDuplicates(String s){
         Stack<Character>stack=new Stack<>();
         
         for(char ch:s.toCharArray()){
             if(!stack.isEmpty() && ch==stack.peek()){
                 stack.pop();
             }else{
             stack.push(ch);
             }
         }
         StringBuilder sb = new StringBuilder();
         while(!stack.isEmpty()){
             sb.append(stack.pop());
         }
         return sb.reverse().toString();
     }
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println( removeDuplicates(s));
    }
}
