// package StringsLeetcode;

public class LengthOfLastWord{
    public static int lengthoflastword(String s){
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else if(count>0){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="My name is Vishal ";
        System.out.println(lengthoflastword(s));
        
    }
}