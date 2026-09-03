import java.util.*;
public class Q557ReverseWordsinaStringIII{
    private static String Reverses(String s){
        Stack<Character>stack=new Stack<>();

        for(char ch:s.toCharArray()){
            stack.push(ch);
        }
        StringBuilder sb= new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static String ReverseWordInString(String s){
        StringBuilder sb = new StringBuilder();
        String[]str=s.split(" ");

        for(String st:str){
            sb.append(Reverses(st));
            sb.append(" ");
        }
        return sb.toString().trim();

    }

    
    public static void main(String[] args) {
        String s="Vishal kumar";
        System.out.println(ReverseWordInString(s));
        
    }
}
