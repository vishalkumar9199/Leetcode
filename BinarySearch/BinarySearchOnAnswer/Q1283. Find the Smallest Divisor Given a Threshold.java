class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int minvalue=1;
        int maxvalue=0;

        for(int num:nums){
            maxvalue=Math.max(maxvalue,num);
        }
        int ans=0;
        while(minvalue<maxvalue){
            int mid=minvalue+(maxvalue-minvalue)/2;

             int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }

                if(sum<=threshold){
                    maxvalue=mid;
                }else{
                    minvalue=mid+1;
                }
        }
        return minvalue;
    }
}
