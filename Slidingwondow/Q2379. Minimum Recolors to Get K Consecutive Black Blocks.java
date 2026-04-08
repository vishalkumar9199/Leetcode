class Solution {
    public int minimumRecolors(String blocks, int k) {
        int Wcount=0;

        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                Wcount++;
            }
        }
        int wMin=Wcount;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W'){
                Wcount--;
            }
            if(blocks.charAt(i)=='W'){
                Wcount++;
            }
            wMin=Math.min(wMin,Wcount);
        }
        return wMin;
    }
}
