class Solution {
    public int longestConsecutive(int[] nums) {
        int longestlength=0;
        Map<Integer,Boolean>map=new HashMap<>();
        for(int num:nums){
            map.put(num,Boolean.FALSE);
        }

        for(int num:nums){
            int currlength=1;
            //check nextnum is availb
            int nextnum=num+1;
            while(map.containsKey(nextnum) && map.get(nextnum)==false){
                currlength++;
                map.put(nextnum,Boolean.TRUE);
                nextnum++;
            }
            

            //check prevnum
            int prevnum=num-1;
            while(map.containsKey(prevnum)&& map.get(prevnum)==false){
                currlength++;
                map.put(prevnum,Boolean.TRUE);
                 prevnum--;
            }
           
            longestlength=Math.max(longestlength,currlength);
        }
        return longestlength;
        
    }
}
