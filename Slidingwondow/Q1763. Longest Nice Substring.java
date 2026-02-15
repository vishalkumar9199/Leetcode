class Solution {
    public String longestNiceSubstring(String s) {
         int l = s.length();
        HashSet<Character>hs= new HashSet<>();

        for(int i=0; i< l; i++){
            hs.add(s.charAt(i));
        } 

        for(int i =0; i< l;i++){
            char ch =s.charAt(i);
            if(hs.contains(Character.toUpperCase(ch)) && hs.contains(Character.toLowerCase(ch))){
                continue;
            }
            String s1 = longestNiceSubstring(s.substring(0,i));
            String s2 = longestNiceSubstring(s.substring(i+1));
     
    return s1.length() >= s2.length()?s1:s2;
        }
        return s;
        
    }
}
