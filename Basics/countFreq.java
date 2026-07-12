import java.util.*;
public class countFreq {
    public static void countfrequence(String s){
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + freq[i]);
            }
        }
    }
    public static void  countfrequence1(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         for(char ch : map.keySet()) {
            System.out.println(ch + " -> " + map.get(ch));
        }

    }
    public static void main(String[] args) {
        String s="vishal";
        countfrequence(s);
        
    }
    
}
