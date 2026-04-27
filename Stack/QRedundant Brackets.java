import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static boolean findRedundantBrackets(String s) 
    {
        Stack<Character>stack=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='(' || ch=='+' || ch=='-' || ch=='*' ||ch=='/'){
                stack.push(ch);
            }else{
                if(ch==')'){
                    char top=stack.peek();
                    if(top=='('){
                        return true;
                    }else{
                        while(stack.peek()!='('){
                            stack.pop();
                        }
                        stack.pop();
                    }
                }
            }
        }
        return false;
        
    }
}
