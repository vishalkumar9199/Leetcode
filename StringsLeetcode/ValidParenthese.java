package StringsLeetcode;

import java.util.*;
public class ValidParenthese{
    public static boolean isValidParenthese(String s){
        Stack<Character>stack= new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='['){
                stack.push(']');
            }else if(ch=='{'){
                stack.push('}');
            }else if(ch=='('){
                stack.push(')');
            }else if(stack.isEmpty() || stack.pop()!=ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s="{[]}";
        System.out.println(isValidParenthese(s));
    }
}