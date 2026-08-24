
import java.util.Stack;

public class Q1047RemoveAllAdjacentDuplicatesInString{

    public static String removeduplicate(String s){
        Stack<Character>stack=new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && ch==stack.peek()){
                stack.pop();
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
        String s="abbaca";
        System.out.println(removeduplicate(s));
    }
}