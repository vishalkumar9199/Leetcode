import java.util.*;
public class countVowelsANDconstant {
    public static void count(String s){
        int vowels=0;
        int consonant=0;
        Set<Character>set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                vowels++;
            }else{
                consonant++;
            }
        }
        System.out.println("vowels are:"+vowels);
        System.out.println("consonant are:"+consonant);
    }
    public static void main(String[] args) {
        String s="aeiou";
        count(s);
        
    }
    
}
