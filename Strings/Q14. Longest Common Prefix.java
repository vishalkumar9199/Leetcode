class Solution {
    public String longestCommonPrefix(String[]s) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(s);
        char[]right=s[0].toCharArray();
        char[]left=s[s.length-1].toCharArray();

        for(int i=0;i<right.length;i++){
            if(right[i]!=left[i]){
                break;
                
            }else{
                sb.append(right[i]);
            }
        }
        return sb.toString();
    }
}
