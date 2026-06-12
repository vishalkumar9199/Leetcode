// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
     public static String removeDuplicateLetters(String s){
         StringBuilder sb = new StringBuilder();
         HashSet<Character>set=new HashSet<>();
         
         for(char ch:s.toCharArray()){
             if(!set.contains(ch)){
                 set.add(ch);
                 sb.append(ch);
             }
         }
         return sb.toString();
     }
    public static void main(String[] args) {
        String s="bcabc";
        System.out.println( removeDuplicateLetters(s));
    }
}
