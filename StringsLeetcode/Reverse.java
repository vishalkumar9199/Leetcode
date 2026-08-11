import java.util.*;
public class Reverse{
    public static String reverse(String s){
        Stack<Character>stack=new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch:s.toCharArray()){
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s ="Hello";
        System.out.println(reverse(s));
    }

}