// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int maxVowels(String s,int k){
        int maxVowels=0;
        int currVowels=0;
        
        Set<Character>set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        
        
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                currVowels++;
            }
        }
        maxVowels=currVowels;
        
        for(int i=k;i<s.length();i++){
            if(set.contains(s.charAt(i-k))){
                currVowels--;
            }
            if(set.contains(s.charAt(i))){
                currVowels++;
            }
            maxVowels=Math.max(currVowels,maxVowels);
        }
        return maxVowels;
    }
    public static void main(String[] args) {
       String s="abciiidef";
       int k=3;
       System.out.println(maxVowels(s,k));
    }
}
