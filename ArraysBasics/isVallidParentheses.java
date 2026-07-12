
import java.util.Stack;

public class isVallidParentheses {
    public static boolean isValid(String str){
        Stack<Character>stack=new Stack<>();

        for(char ch:str.toCharArray()){
            if(ch=='[')
              stack.push(']');
            else if(ch=='{')
               stack.push('}');
            else if(ch=='(')
              stack.push(')');
            else if(stack.isEmpty() || stack.pop()!=ch) return false;       
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str="()[]{}]";
        System.out.println(isValid(str));
        

    }
    
}
