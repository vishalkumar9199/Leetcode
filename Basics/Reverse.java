import java.util.*;
public class Reverse {
    public static String reverseString(String s){
       String str="";
        Stack<Character>stack=new Stack<>();

        for(char ch:s.toCharArray()){
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            str+=stack.pop();
        }
        return str;
       
    }
    public static void main(String[] args) {
        String s="hello";
       
        System.out.println( reverseString(s));
       

    }
    
}
