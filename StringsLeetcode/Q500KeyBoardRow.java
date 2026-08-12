import java.util.*;
public class Q500KeyBoardRow{
    public static String[]keyBoardRow(String[]str){
        Set<Character>row1=new HashSet<>();
        Set<Character>row2=new HashSet<>();
        Set<Character>row3=new HashSet<>();

        for(char ch:"asdfghjkl".toCharArray()){
            row1.add(ch);
        }
        for(char ch:"qwertyuiop".toCharArray()){
            row2.add(ch);
        }
        for(char ch:"zxcvbnm".toCharArray()){
            row3.add(ch);
        }
        List<String>res=new ArrayList<>();
        for(String s:str){
            String sh=s.toLowerCase();
            if(isValid(sh,row1)||isValid(sh,row2)||isValid(sh,row3)){
                res.add(s);
            }
        }
        
        return res.toArray(new String[0]);
    }
    public static boolean isValid(String s,Set<Character>row){
        for(char ch:s.toCharArray()){
            if(!row.contains(ch)){
               return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String[]str={"Hello","Alaska","Dad","Peace"};
        System.out.println(keyBoardRow(str));
    }
}