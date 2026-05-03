class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[]pcount=new int[26];
        int[]scount=new int[26];
        List<Integer>res=new ArrayList<>();
        
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }
        //for sliding window
        for(int i=0;i<s.length();i++){
            //add the character and count freq
            scount[s.charAt(i)-'a']++;
           //remove the charcter after the next letter include
            if(i>=p.length()){
                scount[s.charAt(i-p.length())-'a']--;
            }
            //compare
            if(Arrays.equals(pcount,scount)){
                res.add(i-p.length()+1);
            }
        }
        return res;
        
    }
}
