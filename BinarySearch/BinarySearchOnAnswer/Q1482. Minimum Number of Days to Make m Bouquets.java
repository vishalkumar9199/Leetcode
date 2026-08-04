class Solution {
    //helper function
    public boolean isPossible(int minday,int[]bloomDay,int m,int k){
        int count=0;
        int total=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=minday){
                count++;
            }else{
                count=0;
            }
            if(count==k){
                total++;
                count=0;
            }
            if(total>=m){
                return true;
            }
        }
            return false;
        

    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int start=0;
        int end=0;

        for(int boolm:bloomDay){
            start=Math.min(start,boolm);
            end=Math.max(end,boolm);
        }
        int ans=0;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(mid,bloomDay,m,k)){
                ans=mid;
                end=mid-1;

            }else{
                start=mid+1;
            }
        }
        return ans;

    }
}
