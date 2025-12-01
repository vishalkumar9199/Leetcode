
import java.util.*;

class Main {
    public static boolean ValidParentheses(String s){
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String s="{}[]({})";
        System.out.println(ValidParentheses(s));
    }
}
