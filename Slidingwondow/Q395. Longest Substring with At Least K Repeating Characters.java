class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;
        HashMap<Character,Integer>map=new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         for (char freq : map.keySet()) {
            if (map.get(freq)<k) {
               int max = 0;
                for (String part : s.split(String.valueOf(freq))) {
                    max = Math.max(max, longestSubstring(part, k));
                }
                return max;
            }
        }
       return s.length();
    }
}
