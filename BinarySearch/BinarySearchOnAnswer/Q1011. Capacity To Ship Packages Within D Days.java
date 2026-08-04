class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap=0;
        int maxCap=0;

        for(int weight:weights){
            minCap=Math.max(minCap,weight);
            maxCap+=weight;
        }

        //apply binarySearch
        while(minCap<=maxCap){
            int mid=minCap+(maxCap-minCap)/2;

            int day=1;
            int sum=0;
            for(int weight:weights){
                if(weight+sum>mid){
                    day++;
                    sum=0;
                }
                sum+=weight;
            }
            if(day>days){
                minCap=mid+1;
            }else{
                maxCap=mid-1;
            }
        }
        return minCap;
    }
}
